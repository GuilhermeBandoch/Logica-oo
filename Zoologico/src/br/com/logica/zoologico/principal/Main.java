package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {
	
	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Animal a1 = new Animal();
		
		a1.setNome("Jojo todinho");
		a1.setEspecie("Gato");
		a1.setIdade (1);
		
		// Criando uma nova instancai do objeto
		Animal a2 = new Animal();
		
		//atribuindo os valores as propriedade
		a2.setNome("Spike");
		a2.setEspecie("Cachorro");
		a2.setIdade(3);
		
		System.out.println("Ola o nome do meu animal é " + a2.getNome());
	}

}
