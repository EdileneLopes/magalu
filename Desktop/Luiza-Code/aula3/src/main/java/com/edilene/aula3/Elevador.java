package com.edilene.aula3;

public class Elevador {

	private int andarAtual;
	private int totalAndaresPredio;
	private int capacidadePessoas;
	private int qtdePessoasDentro;
	
	
	
	public Elevador() {	}
	
	/*
	public Elevador(int andarAtual, int totalAndaresPredio, int capacidadePessoas, int qtdePessoasDentro) {
		super();
		this.andarAtual = andarAtual;
		this.totalAndaresPredio = totalAndaresPredio;
		this.capacidadePessoas = capacidadePessoas;
		this.qtdePessoasDentro = qtdePessoasDentro;
	}
	
	*/
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndaresPredio() {
		return totalAndaresPredio;
	}
	public void setTotalAndaresPredio(int totalAndaresPredio) {
		this.totalAndaresPredio = totalAndaresPredio;
	}
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	public int getQtdePessoasDentro() {
		return qtdePessoasDentro;
	}
	public void setQtdePessoasDentro(int qtdePessoasDentro) {
		this.qtdePessoasDentro = qtdePessoasDentro;
	}
	
	public void  inicializarElevador(int capacidadePessoas, int totalAndaresPredio ) {
		qtdePessoasDentro = 0;
		andarAtual = 0;
		
		System.out.println("Iniciando atividades do elevador. Estamos no andar:  " + andarAtual + " Vazio " +qtdePessoasDentro );
		
	}
	
	public int entrarElevador(int qtdePessoasDentro, int capacidadePessoas) {
		
		if(this.getQtdePessoasDentro() < this.getCapacidadePessoas()) {
			this.qtdePessoasDentro += 1;
			System.out.println("Entrou, agora temos "+ qtdePessoasDentro + " pessoas no elevador." );

		}
		return qtdePessoasDentro;
		
	}
	
	public int sairElevador(int qtdePessoasDentro) {
		if(qtdePessoasDentro > 0) {
			qtdePessoasDentro -=1;
			
			System.out.println("Saiu. Então temos "+ qtdePessoasDentro + " pessoas no elevador." );
					
		}
		return qtdePessoasDentro;
	}
	
	
		
	public void subirElevador(int andarAtual, int totalAndaresPredio) {
		System.out.println("Elevador subindo...");
		
		if(andarAtual < totalAndaresPredio) {
			andarAtual += 1;
			System.out.println("Subimos para o andar "+ andarAtual );
		}else {
			System.out.println("Não podemos subir, estamos na cobertura.");
		}
		
	}
	
	public void descerElevador(int andarAtual) {
		System.out.println("Elevador descendo...");
		
		if(andarAtual != 0) {
			andarAtual -=1;
			System.out.println("Desceu para o andar "+ andarAtual);
		}else {
			System.out.println("Não dá para descer, estamos no térreo.");
		}
	}
}





