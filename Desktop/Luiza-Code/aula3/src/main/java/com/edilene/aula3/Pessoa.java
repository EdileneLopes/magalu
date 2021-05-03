package com.edilene.aula3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;


public class Pessoa  {

	private String nome;
	private LocalDate dataNascimento;
	private float altura;
	
	private Agenda agenda;	
	
	public Pessoa() {
		 
	 }
		
	
	public Pessoa(String nome, LocalDate dataNascimento, float altura) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) { 
		
		this.nome = nome;}
	
	public LocalDate getDataNascimento() {
		
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) { 
		this.dataNascimento = dataNascimento;
	}
	
		
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) { 
		
		this.altura = altura; 
	}
	
	
	
	LocalDate hoje = LocalDate.now();
	
	public void calcularIdade(LocalDate dataNascimento) {
		if((dataNascimento != null)  && (hoje != null)) {
			int idade;
			System.out.println("A idade é ");
			System.out.println(idade = Period.between(dataNascimento, hoje).getYears());
		}else {
		
		}
		
		
	}
	 	
	
	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", dataNascimento= " + dataNascimento + ", altura= " + altura + "]";
	}


	}