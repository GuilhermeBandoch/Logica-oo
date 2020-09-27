package br.com.logica.zoologico.classes;

	// Construindo o objeto animal
public class Animal {
	
	// atributos ou propriedade do objeto
	// nesse momento as propiedades são públicas
	 private String nome;
	 private String especie;
	 private int idade;
	
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
	 
}
