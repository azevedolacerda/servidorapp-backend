package com.example.servidorappbackend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.servidorappbackend.domain.enums.CategoriaFuncional;

@Entity
public class Servidor {

	@Id 
	private String id;
	private String nome;
	private CategoriaFuncional categoriaFuncional;
	private String lotacao;
	
	public Servidor() {}
	
	public Servidor(String id, String nome, CategoriaFuncional categoriaFuncional, String lotacao) {
		this.id = id;
		this.nome = nome;
		this.categoriaFuncional = categoriaFuncional;
		this.lotacao = lotacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaFuncional getCategoriaFuncional() {
		return categoriaFuncional;
	}

	public void setCategoriaFuncional(CategoriaFuncional categoriaFuncional) {
		this.categoriaFuncional = categoriaFuncional;
	}

	public String getLotacao() {
		return lotacao;
	}

	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}
	

}
