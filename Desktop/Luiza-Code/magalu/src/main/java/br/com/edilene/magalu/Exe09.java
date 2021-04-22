package br.com.edilene.magalu;

import java.util.Scanner;

public class Exe09 {
	
	public void calcularSalario() {
		
		System.out.println("-----Exercicio 09 -------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário mensal:");
		double salario = scan.nextDouble();
		
		System.out.println("Digite a porcentagem de reajuste:");
		double reajuste = scan.nextDouble();
		
		double aumento = (salario * reajuste)/100;
		double novoSalario = aumento + salario;
		
		System.out.println("O reajuste foi de:" + aumento);
		System.out.println("Então o salário passou a ser de :" + novoSalario);
	}

}
