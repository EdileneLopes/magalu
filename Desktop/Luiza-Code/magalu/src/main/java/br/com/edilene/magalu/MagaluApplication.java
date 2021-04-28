package br.com.edilene.magalu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import livraria.Cliente;
import livraria.Livraria;
import livraria.Livros;

@SpringBootApplication
public class MagaluApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagaluApplication.class, args);
		
					  			
		 Livraria livraria = new Livraria();

	        livraria.criarListaDeClientes();
	        livraria.criarListaDelivros();

	        Scanner scan = new Scanner(System.in);

	        System.out.println("Olá, bem vindo a Livaria Casa");
	        System.out.println("Você deseja ( 1 ) Alugar - ( 2 ) Devolver livro - ( 3 ) Trazer todos os não alugados");
	        Integer escolha = scan.nextInt();

	        if(escolha.equals(1)){
	            livraria.validaClienteParaAlugar();
	        }else if (escolha.equals(2)){
	            livraria.devolverLivro();
	        }else if (escolha.equals(3)){
	            livraria.listarTodosNaoAlugados();
	        } else{
	            System.out.println("Opcao não disponivel");
	        }
	    }
}

