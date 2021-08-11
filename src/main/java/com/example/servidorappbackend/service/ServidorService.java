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
	
	public List<Servidor> listarTodos(){
		return sevidoRepository.findAll();
	}
	
	public Servidor salvar(Servidor servidor){
		return sevidoRepository.save(servidor);
	}
	
	public Optional<Servidor> findById(String id){
		return sevidoRepository.findById(id);
	}
	
	public void deletar(String id) {
		sevidoRepository.deleteById(id);
	}
	
	public void alterar(String id, Servidor servidor) {
		servidor.setId(id);
		sevidoRepository.save(servidor);
	}
	
}