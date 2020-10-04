package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Cavalo extends Animal {

	public Cavalo(String nome, String especie, int idade, String corPelo) {
		super(nome, especie, idade, corPelo);
	}

	public Cavalo(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som de cavalo");
		
	}

}
