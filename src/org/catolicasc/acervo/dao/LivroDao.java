package org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.catolicasc.acervo.model.Livro;

public class LivroDao {

	public List<Livro> obterLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		
		Livro livro1 = new Livro();
		livro1.setEditora("Laranjeiras");
		livro1.setAno(2015);
		livro1.setNome("Fluminense - A conquista");
		livro1.setResumo("A história da conquista da libertadores da américa");
		livro1.setAutores(Arrays.asList("Fred", "Conca", "Cícero"));
		livros.add(livro1);
		
		Livro livro2 = new Livro();
		livro2.setEditora("Maracanã");
		livro2.setAno(2014);
		livro2.setNome("Fluminense - Brasileirão");
		livro2.setResumo("Fluminense: Penta campeão brasileiro");
		livro2.setAutores(Arrays.asList("Cavalieri", "Jean", "Wágner"));		
		livros.add(livro2);
		
		return livros;
	}

}
