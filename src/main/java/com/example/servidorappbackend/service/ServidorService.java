package com.example.servidorappbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servidorappbackend.domain.Servidor;
import com.example.servidorappbackend.repository.ServidorRepository;

@Service
public class ServidorService {
	
	@Autowired
	private ServidorRepository sevidoRepository;
	
	public List<Servidor> listarTodos() throws Exception {
		return sevidoRepository.findAll();
	}
	
	public Servidor salvar(Servidor servidor) throws Exception {
		return sevidoRepository.save(servidor);
	}
	
	public Optional<Servidor> findById(String id) throws Exception {
		return sevidoRepository.findById(id);
	}
	
	public void deletar(String id) throws Exception  {
		sevidoRepository.deleteById(id);
	}
	
	public void deletarServidores(List<String> id) throws Exception {
		sevidoRepository.deleteAllByIdInBatch(id);
	}
	
	public Servidor alterar(String id, Servidor servidor) throws Exception {
		servidor.setId(id);
		return sevidoRepository.save(servidor);
	}
	
}