package com.meuempregado.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.meuempregado.dao.AtividadeDao;
import com.meuempregado.model.Atividade;


public class AtividadeService {
	
	private AtividadeDao dao = new AtividadeDao(Atividade.class); 
	public List<Atividade> listAll(){
		return dao.listarTodos();
	}
	
	public void insertAtividade(Atividade a){
		if(a != null)
			dao.inserir(a);
	}

	public void updateAtividade(Atividade atividade) {
		// TODO Auto-generated method stub
		dao.alterar(atividade);
		
	}
	
	public Atividade AtividadePorId(Integer id) throws SQLException, ClassNotFoundException, IOException {
		return (Atividade) dao.buscarPorId(id);
	}

}
