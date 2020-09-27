package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {
	
	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Animal gato = new Animal("Jojo todinho","Gato",1);
		
		gato.emitirSom();
		
		System.out.println("Ol�, seu animal � um " + gato.getEspecie()+", o nome dele � " + gato.getNome() + "e tem "+gato.getIdade()+" anos");
		
		if(gato.isAdult()) {
			System.out.println("� adulto");
		}else {
			System.out.println("N�o � adulto");
		}
		
		System.out.println("---------------------------------");
		// Criando uma nova instancai do objeto
		Animal cachorro = new Animal("Spike","cachorro",3);
		
		//atribuindo os valores as propriedade
		
		
		cachorro.emitirSom();
		
		System.out.println("Ol�, seu animal � um " + cachorro.getEspecie()+", o nome dele � " + cachorro.getNome() + "e tem "+cachorro.getIdade()+" anos");

		
		if(cachorro.isAdult()) {
			System.out.println("� adulto");
		}else {
			System.out.println("N�o � adulto");
		}
	}

}
