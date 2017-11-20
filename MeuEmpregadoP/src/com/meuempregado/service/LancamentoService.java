package com.meuempregado.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.meuempregado.dao.LancamentoDao;
import com.meuempregado.model.Lancamento;


public class LancamentoService {
	

		private LancamentoDao dao = new LancamentoDao(null); 
		
		public List<Lancamento> listAll(){
			
			return dao.listarTodos();
		}
		
		public void insertLancamento(Lancamento c){
		
			if(c != null)
				dao.insertLancamento(c);
		}

		public void updateLancamento(Lancamento l) throws ClassNotFoundException, SQLException, IOException {
			// TODO Auto-generated method stub
			dao.updateLancamento(l);
		}
		
		public void deleteLancamento(Lancamento l ) throws ClassNotFoundException, SQLException, IOException {
			dao.deleteLancamento(l);
		}
		
		public Lancamento LancamentoPorId(Integer idLancamento) throws SQLException, ClassNotFoundException, IOException {
			return dao.lancamentoPorId(idLancamento);
			
		}
		
		public List<Lancamento> searchLancamento(int idTipo, int idAtividade) {
			
			return dao.pesquisar(idTipo, idAtividade);
		}

		

}
