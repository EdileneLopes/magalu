package br.com.edilene.magalu;

import java.util.Scanner;

public class Exe11 {
	
		public void salarioFinal() {
		
		System.out.println("-----Exercicio 11 -------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de carros vendidos: ");
		int qtdeCarros = scan.nextInt();
		
		System.out.println("Informe o valor total de vendas no Mês:");
		double valorVendas = scan.nextFloat();
		
		System.out.println("Informe o salário fixo:");
		double salarioFixo = scan.nextFloat();
		
		double comissaoFixa = qtdeCarros * 100;
		double comissaoVendas = valorVendas * 0.05;
		double novoSalario = salarioFixo + comissaoVendas + comissaoFixa;
		
		System.out.println("Comissão fixa:" + comissaoFixa);
		System.out.println("Comissão total de vendas:" + comissaoVendas);
		System.out.println("O salário total é de:" + novoSalario);
		
		}
}