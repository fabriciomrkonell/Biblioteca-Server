package org.catolicasc.acervo.model;

import java.util.List;

public class Livro {
	
	private String nome;
	private String editora;
	private int ano;
	private String resumo;
	private List<String> autores;
	
	
	public Livro() {
		super();	
	}

	public Livro(String nome, String editora, int ano, String resumo,
			List<String> autores) {
		super();
		this.nome = nome;
		this.editora = editora;
		this.ano = ano;
		this.resumo = resumo;
		this.autores = autores;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	
	

}
