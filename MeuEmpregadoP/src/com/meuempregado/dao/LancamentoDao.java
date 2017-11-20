package com.meuempregado.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.meuempregado.model.Atividade;
import com.meuempregado.model.Lancamento;
import com.meuempregado.model.TipoLancamento;
import com.meuempregado.service.LancamentoService;

public class LancamentoDao extends GenericDao{

	public LancamentoDao(Class entityClass) {
		super(entityClass);
	}
	
	@SuppressWarnings("unchecked")
	public void insertLancamento(Lancamento l){
		inserir(l);
	}
	
	public void updateLancamento(Lancamento l) throws SQLException, ClassNotFoundException, IOException {
		alterar(l);
	}
	
	public List<Lancamento> listarTodos(){
		List<Lancamento> lista = new ArrayList<Lancamento>();
		
		return lista;
	}
	
	public List<Lancamento> pesquisar(int idTipo, int idAtividade){
		List<Lancamento> lista = new ArrayList<Lancamento>();
		System.out.println("Tipo = " + idTipo + " Atividade = " + idAtividade);
		
		return lista;
	}
	
	
	public Lancamento lancamentoPorId(int idLancamento) throws SQLException, ClassNotFoundException, IOException {
		
		return (Lancamento) buscarPorId(idLancamento);	
	}
	
	public void deleteLancamento(Lancamento l) throws SQLException, ClassNotFoundException, IOException {
		
		excluir(l);	
		
	}
}