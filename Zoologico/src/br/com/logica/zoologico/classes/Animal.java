package br.com.logica.zoologico.classes;

import br.com.logica.Interfaces.IAnimal;

// Construindo o objeto animal
public abstract class Animal implements IAnimal {

	// atributos ou propriedade do objeto
	// nesse momento as propiedades s�o p�blicas
	private String nome;
	private String especie;
	protected int idade;
	private String corPelo;
	protected boolean estaVivo;

	public Animal(String nome, String especie, int idade, String corPelo) {

		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.corPelo = corPelo;
		this.estaVivo = true;

	}

	// construtor padr�o do java
	public Animal() {
	}

	// para dar ascesso utilizamos os metodos acessores
	// GETTER e SETTER
	public Animal(String nome) {
		this.nome = nome;
		this.estaVivo = true;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}
	
	public void setcorPelo(String cor) {
		this.corPelo = cor;
	}

	public String getcorPelo() {
		return corPelo;
	}

}
