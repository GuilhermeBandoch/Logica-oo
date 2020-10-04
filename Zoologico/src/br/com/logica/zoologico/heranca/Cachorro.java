package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Cachorro extends Animal {

	public Cachorro(String nome, String especie, int idade, String corPelo) {
		super(nome, especie, idade, corPelo);
	}

	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
		
	}
	

}
