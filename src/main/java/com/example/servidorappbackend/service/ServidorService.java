package com.example.servidorappbackend.service;

import java.util.List;

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
	
}