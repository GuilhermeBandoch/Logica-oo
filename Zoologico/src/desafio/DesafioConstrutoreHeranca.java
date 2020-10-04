package desafio;

import java.util.Scanner;

class PessoaDesafio {
    private String nome;
    private int idade;

    public PessoaDesafio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void showInfo() {
        System.out.println(nome);
        System.out.println(idade);
    }
}

class ProgramadorDesafio extends PessoaDesafio{

    private String linguagem;

    public ProgramadorDesafio(String nome, int idade) {
        super(nome, idade);
    }

    public ProgramadorDesafio(String nome, int idade, String linguagem) {
        super(nome, idade);
        this.linguagem = linguagem;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(linguagem);
    }
}

public class DesafioConstrutoreHeranca {
	
	
	public static void main(String []args){
        Scanner scann = new Scanner(System.in);

        PessoaDesafio a = new ProgramadorDesafio(scann.nextLine(), Integer.valueOf(scann.nextLine()), scann.nextLine());

        a.showInfo();
    }
}
