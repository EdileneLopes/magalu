package br.com.edilene.magalu;

import java.util.Scanner;

public class Exe06 {

	public void calcularArea() {
		System.out.println("-----Exercicio 06 -------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a base do retangulo:");
		double base = scan.nextDouble();
		
		System.out.println("Agora a altura:");
		double altura = scan.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A área do retangulo é:  " + area );
		
		scan.close();
}
	
}
