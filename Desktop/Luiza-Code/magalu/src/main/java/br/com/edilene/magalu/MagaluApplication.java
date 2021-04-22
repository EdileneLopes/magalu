package br.com.edilene.magalu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagaluApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagaluApplication.class, args);
		
		Exe03 exe03 = new Exe03();
		exe03.testar();
		
		Exe04 exe04 = new Exe04();
		exe04.calcular();
		
		Exe05 exe05 = new Exe05();
		exe05.escrever();
		
		Exe06 exe06 = new Exe06();
		exe06.calcularArea();
		
		Exe07 exe07 = new Exe07();
		exe07.calcularDias();
		
		Exe08 exe08 = new Exe08();
		exe08.calcularPercentual();
		
		Exe09 exe09 = new Exe09();
		exe09.calcularSalario();
		
		Exe10 exe10 = new Exe10();
		exe10.precoCarro();
		
		Exe11 exe11 = new Exe11();
		exe11.salarioFinal();
			       
	    }
	}

