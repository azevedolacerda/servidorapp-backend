package com.example.servidorappbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Servidor> listarTodos(){
		return servidorService.listarTodos();
	}
	
	@GetMapping("/{id}")
	public Servidor buscarServidor(@PathVariable("id") String id){
		return null;
	}
	
	@PostMapping
	public Servidor salvarServidor(@RequestBody Servidor servidor){
		return servidorService.salvar(servidor);
	}
	
	@PutMapping
	public List<Servidor> alterarServidor(@PathVariable("id") String id, @RequestBody Servidor servidor){
		return null;
	}
	
	@DeleteMapping
	public List<Servidor> deletarServidorById(@PathVariable("id") String id){
		return null;
	}
	
	@DeleteMapping("/lote")
	public List<Servidor> deletarServidores(@PathVariable("id") List<String> id){
		return null;
	}
	
}
