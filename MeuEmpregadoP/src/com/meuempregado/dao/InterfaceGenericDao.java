package com.meuempregado.dao;

import java.util.List;

import com.meuempregado.model.Lancamento;

public interface InterfaceGenericDao<E>{
	
	void inserir(E entity);
	void alterar(E entity);
	void excluir(E entity);
	List<E> listarTodos();
	E buscarPorId(Integer id);
	Integer contarTodos();
	
	
}
