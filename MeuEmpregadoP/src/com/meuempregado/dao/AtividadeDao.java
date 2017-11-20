package com.meuempregado.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.meuempregado.model.Atividade;
import com.meuempregado.service.AtividadeService;

public class AtividadeDao extends GenericDao{
	
	public AtividadeDao(Class entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public void insertAtividade(Atividade a){
			inserir(a);
	}
	
	public List<Atividade> listarTodos(){
		List<Atividade> lista = listarTodos();
		
		// Se por acado não houve retorno do banco de dados, retorna
		return lista;
	}
	public Atividade atividadePorId(int idAtividade)throws SQLException, ClassNotFoundException, IOException {
		return (Atividade) buscarPorId(idAtividade);
	}


}
