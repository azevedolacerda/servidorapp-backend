package com.example.servidorappbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servidorappbackend.domain.Servidor;
import com.example.servidorappbackend.service.ServidorService;

@RestController
@RequestMapping("/servidor")
public class ServidorController {
	
	@Autowired
	private ServidorService servidorService;

	@GetMapping
	public List<Servidor> listarTodos() throws Exception {
		return servidorService.listarTodos();
	}
	
	@GetMapping("/{id}")
	public Servidor buscarServidor(@PathVariable("id") String id) throws Exception {
		Servidor servidor = servidorService.findById(id).get();
		return servidor;
	}
	
	@PostMapping
	public ResponseEntity<Servidor> salvarServidor(@RequestBody Servidor servidor) throws Exception {
		return ResponseEntity.ok(servidorService.salvar(servidor));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Servidor> alterarServidor(@PathVariable("id") String id, @RequestBody Servidor servidor) throws Exception {
		return ResponseEntity.status(HttpStatus.CREATED).body(servidorService.alterar(id, servidor));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletarServidorById(@PathVariable("id") String id) throws Exception {
		servidorService.deletar(id);
		return ResponseEntity.ok(null);
	
	}
	
	@DeleteMapping("/lote")
	public ResponseEntity<?>  deletarServidores(@RequestBody List<String> listId) throws Exception {
		servidorService.deletarServidores(listId);
		return ResponseEntity.ok(null);
	}
	
}
