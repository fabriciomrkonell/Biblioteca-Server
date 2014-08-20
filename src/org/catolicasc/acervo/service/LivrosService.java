package org.catolicasc.acervo.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import org.catolicasc.acervo.dao.LivroDao;
import org.catolicasc.acervo.model.Livro;
import org.catolicasc.acervo.model.Usuario;

@WebService
public class LivrosService {
	
	@WebResult(name = "livro")
	public List<Livro> listarLIvros(){
		LivroDao dao = new LivroDao();
		return dao.obterLivros();		
	}
	
	private LivroDao obterDAO(){
		return new LivroDao();
	}
	
	public void criarLivro(@WebParam(name="livro") Livro livro, @WebParam(name="usuario") Usuario usuario) throws UsuarioNaoAutorizadoException{
		if(usuario.getLogin().equals("admin") && usuario.getSenha().equals("admin")){
			obterDAO().criarLivro(livro);
		}else{
			throw new UsuarioNaoAutorizadoException("Não autorizado! Erro!");
		}
		
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/livros", new LivrosService());		
		System.out.println("Serviço inicializado!");
	}

}
