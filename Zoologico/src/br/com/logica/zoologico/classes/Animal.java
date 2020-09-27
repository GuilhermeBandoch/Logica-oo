package br.com.logica.zoologico.classes;

	// Construindo o objeto animal
public abstract class Animal {
	
	// atributos ou propriedade do objeto
	// nesse momento as propiedades são públicas
	 private String nome;
	 private String especie;
	 private int idade;
	 
	 public Animal(String nome, String especie, int idade) {
		 
		 this.nome = nome;
		 this.especie = especie;
		 this.idade = idade;
		 
	 }
	 //construtor padrão do java
	 public Animal() {}
	 //para dar ascesso utilizamos os metodos acessores
	 // GETTER e SETTER
	 public Animal(String nome) {
		 this.nome = nome;
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
	 
	 public void emitirSom() {
		 System.out.println("Som do animal");
	 }
	 
	 public boolean isAdult() {
		 return idade >1;
	 }
	 
}
