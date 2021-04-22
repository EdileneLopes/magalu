package br.com.edilene.magalu;

public class Exe03 {
	
	public void testar() {
		System.out.println("-----Exercicio 03 -------");
		int a = (4/2) + (2/4);
		int b = 4/2 + 2/4;
		
		System.out.println(" Tem o mesmo resultado? " + a + " ----"+ b);
		
		
		int c = 4/(2+2)/4;
		int d = 4/2 + 2/4;
		
		System.out.println("E agora como são os resultados? "+ c + "----"+ d);
		
		int e = (4+2) * 2-4;
		int f = 4+2 * 2-4;
		
		System.out.println("Comparando... "+ e +"----"+ f);
    }
}