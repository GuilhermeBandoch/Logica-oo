package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {
	
	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Animal a1 = new Animal();
		
		a1.nome = "Jojo todinho";
		a1.especie = "Gato";
		a1.idade = 1;
		
		// Criando uma nova instancai do objeto
		Animal a2 = new Animal();
		
		//atribuindo os valores as propriedade
		a2.nome = "Spike";
		a2.especie = "Cachorro";
		a2.idade = 3;
	}

}
