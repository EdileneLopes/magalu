package com.edilene.aula3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula3Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula3Application.class, args);
		

		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Pedro");
		pessoa.setDataNascimento(LocalDate.of(2013,Month.APRIL,18));
		pessoa.setAltura(1.30f);
		System.out.println(pessoa.toString());
		
		pessoa.calcularIdade(LocalDate.of(2013, 04, 18));
		
			
		
		System.out.println(" ");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Helena");
		pessoa.setDataNascimento(LocalDate.of(2013,02,10));
		pessoa2.setAltura(1.20f);
		
	
		System.out.println("---------------------Exercício 2------------------");
		
		Pessoa[] pessoas = new Pessoa[3];
		pessoas[0] = pessoa;
		pessoas[1] = pessoa2;
		
		
			
		System.out.println("Nome na agenda: " + pessoas[0].getNome() );
		System.out.println("Agenda Nome: "+ pessoas[1].getNome());
		System.out.println("Agenda Altura : "+ pessoas[1].getAltura());
		System.out.println(" ");
		System.out.println("---------------------Exercício 3------------------");
		
		Elevador elevador = new Elevador();
		
		elevador.setAndarAtual(1);	
		elevador.setCapacidadePessoas(6);
		elevador.setQtdePessoasDentro(1);
		elevador.setTotalAndaresPredio(7);
		
		System.out.println("Andar atual " + elevador.getAndarAtual());
		System.out.println("Capacidade  " + elevador.getCapacidadePessoas());
		System.out.println("Quantidade pessoas dentro  " + elevador.getQtdePessoasDentro());
		System.out.println("Andares no prédio  " + elevador.getTotalAndaresPredio());
		
		System.out.println("----------------------------------");
		elevador.inicializarElevador(4, 7);
		System.out.println("----------------------------------");
		elevador.entrarElevador(4, 4);
		System.out.println("----------------------------------");
		elevador.sairElevador(4);
		System.out.println("----------------------------------");
		elevador.subirElevador(8, 8);
		System.out.println("----------------------------------");
		elevador.descerElevador(8);
	}

		
	}
	
		
		