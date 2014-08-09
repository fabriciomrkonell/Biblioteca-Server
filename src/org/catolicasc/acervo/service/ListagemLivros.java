package org.catolicasc.acervo.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import org.catolicasc.acervo.dao.LivroDao;
import org.catolicasc.acervo.model.Livro;

@WebService
public class ListagemLivros {
	
	public List<Livro> listarLIvros(){
		LivroDao dao = new LivroDao();
		return dao.obterLivros();		
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/livros", new ListagemLivros());		
		System.out.println("Serviço inicializado!");
	}

}
