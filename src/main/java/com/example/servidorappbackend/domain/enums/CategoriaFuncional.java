package com.example.servidorappbackend.domain.enums;

public enum CategoriaFuncional {

	EFETIVO(0, "Efetivo"), 
	CNE(1, "Cne"), 
	SP(2, "Secretário Parlamentar");

	private String nome;
	private Integer id;
	
	private CategoriaFuncional(Integer id, String nome) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public static CategoriaFuncional getById(Long id) {
		for (CategoriaFuncional categoriaFuncional : values()) {
			if (categoriaFuncional.id.equals(id)) {
				return categoriaFuncional;
			}	
		}
		return null;
	}

	
}
