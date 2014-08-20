package org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.catolicasc.acervo.model.Livro;

public class LivroDao {

	private static List<Livro> Livros = new ArrayList<Livro>();
	
	static {
		Livro livro1 = new Livro();
		livro1.setAno(2015);
		livro1.setNome("Fluminense - A conquista");
		livro1.setResumo("A História da Conquista da Libertadores da América");
		livro1.setAutores(Arrays.asList("Fred", "Conca", "Cícero"));
		Livros.add(livro1);
		
		Livro livro2 = new Livro();
		livro2.setEditora("Maracanã");
		livro2.setAno(2014);
		livro2.setNome("Fluminense - Brasileirão");
		livro2.setResumo("Fluminense: Penta Campeão Brasileiro");
		livro2.setAutores(Arrays.asList("Cavalieri", "Jean", "Wágner"));
		
		Livro livro3 = new Livro();
		livro3.setEditora("Books");
		livro3.setAno(1852);
		livro3.setNome("Eu Amo Java");
		livro3.setResumo("Java S2");
		livro3.setAutores(Arrays.asList("Fabricio"));
		
		Livros.add(livro2);
	}
	
	public List<Livro> obterLivros() {							
		return Livros;
	}
	
	public void criarLivro(Livro livro) {
		Livros.add(livro);
	}

}
