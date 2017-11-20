package com.meuempregado.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.meuempregado.model.Atividade;
import com.meuempregado.model.TipoLancamento;
import com.meuempregado.service.TipoLancamentoService;

public class TipoLancamentoDao extends GenericDao {
	
	public TipoLancamentoDao(Class entityClass) {
		super(entityClass);
	}
	
	@SuppressWarnings("unchecked")
	public void insertTipoLancamento(TipoLancamento tl){
		inserir(tl);
	}
	public List<TipoLancamento> listarTodos(){
		List<TipoLancamento> lista = new ArrayList<TipoLancamento>();
		
		return lista;
		
	}
	public TipoLancamento tipoLancamentoId(int idTipo)throws SQLException, ClassNotFoundException, IOException {
		
		return (TipoLancamento) buscarPorId(idTipo);
	}


}
