package com.meuempregado.model;

public enum TipoUsuario {
	ADMINISTRADOR("ADMINISTRADOR"), EMPREGADO("EMPREGADO"), EMPREGADOR("EMPREGADOR");
	
	private String nome;
	
	private TipoUsuario(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
