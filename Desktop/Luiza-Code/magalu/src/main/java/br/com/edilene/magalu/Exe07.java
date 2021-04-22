package br.com.edilene.magalu;

import java.util.Scanner;

public class Exe07 {

	public void calcularDias() {
		System.out.println("-----Exercicio 07 -------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem:");
		int anos = scan.nextInt();
		
		System.out.println("Informe quantos meses:");
		int meses = scan.nextInt();
		
		System.out.println("Agora digite quantos dias:");
		int dias = scan.nextInt();
		
		int calculoMeses = anos * 12;
		int calculoDias = (calculoMeses * 30) + (meses * 30) + dias;
		
		System.out.println("Você tem " + calculoDias + " de vida.");
		
	
	}
}
