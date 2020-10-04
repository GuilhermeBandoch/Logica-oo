package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;
import br.com.logica.zoologico.heranca.Cachorro;
import br.com.logica.zoologico.heranca.Cavalo;
import br.com.logica.zoologico.heranca.Gato;

public class Main {
	
	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Gato gato = new Gato("Jojo todinho","Gato",1,"preto");
		
		gato.emitirSom();
		
		System.out.println("Olá, seu animal é um " + gato.getEspecie()+", o nome dele é " + gato.getNome() + "e tem "+gato.getIdade()+" anos");
		
		if(gato.isAdult()) {
			System.out.println("É adulto");
		}else {
			System.out.println("Não é adulto");
		}
		
		System.out.println("---------------------------------");
		// Criando uma nova instancai do objeto
		Cachorro cachorro = new Cachorro("Spike","cachorro",3,"branco");
		
		//atribuindo os valores as propriedade
		
		
		cachorro.emitirSom();
		
		System.out.println("Olá, seu animal é um " + cachorro.getEspecie()+", o nome dele é " + cachorro.getNome() + "e tem "+cachorro.getIdade()+" anos");

		cachorro.morrer();
		
		if(cachorro.isAdult()) {
			System.out.println("É adulto");
		}else {
			System.out.println("Não é adulto ou está morto");
		}
		
		System.out.println("---------------------------------");
		
		Cavalo cavalo = new Cavalo("Agnaldo","cavalo",4,"cinza");
		
		//cavalo.setEspecie("cavalo");
		//cavalo.setIdade(4);
		//cavalo.setcorPelo("cinza");
		
		cavalo.emitirSom();
		
		System.out.println("Olá, seu animal é um " + cavalo.getEspecie()+", o nome dele é " + cavalo.getNome() + " e tem "+cavalo.getIdade()+" anos");
		
		if(cavalo.isAdult()) {
			System.out.println("É adulto");
		}else {
			System.out.println("Não é adulto");
		}
		
		
	}

}
