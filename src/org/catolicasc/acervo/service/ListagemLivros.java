package org.catolicasc.acervo.service;

import java.util.List;

import org.catolicasc.acervo.dao.LivroDao;
import org.catolicasc.acervo.model.Livro;

public class ListagemLivros {
	
	public List<Livro> listarLIvros(){
		LivroDao dao = new LivroDao();
		return dao.obterLivro();		
	}

}
