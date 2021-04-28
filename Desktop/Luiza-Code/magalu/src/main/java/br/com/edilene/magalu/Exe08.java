package br.com.edilene.magalu;

import java.util.Scanner;

public class Exe08 {
	
	public void calcularPercentual() {

	System.out.println("-----Exercicio 08 -------");
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe o número total de eleitores:");
	double qtdeEleitores = scan.nextDouble();
	
	System.out.println("Digite o total de votos brancos:");
	double votosBrancos = scan.nextDouble();
	
	System.out.println("Digite o total de votos nulos:");
	double votosNulos = scan.nextDouble();
	
	System.out.println("Informe o total de votos válidos:");
	double votosValidos = scan.nextDouble();
	
	double percentualVotosBrancos = (votosBrancos / qtdeEleitores)*100;
	double percentualVotosNulos = (votosNulos / qtdeEleitores)*100;
	double percentualVotosValidos = (votosValidos / qtdeEleitores)*100;
	
	System.out.println("O percentual de votos brancos é: "+ percentualVotosBrancos + "%");
	System.out.println("O percentual de votos nulos é: "+ percentualVotosNulos + "%");
	System.out.println("O percentual de votos válidos é: "+ percentualVotosValidos + "%");
		
	scan.close();
		 
} 
}