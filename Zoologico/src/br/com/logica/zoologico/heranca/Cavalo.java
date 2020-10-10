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
		if(estaVivo) {
			System.out.println("som de cavalo");
		}else {
			System.out.println("O animal morreu");
		}
	}
	
	@Override
	public boolean isAdult() {
		if(estaVivo){
			return idade >= 6;
		}
		return false;
	}

	@Override
	public void morrer() {
		this.estaVivo = false;
		
	}

}
