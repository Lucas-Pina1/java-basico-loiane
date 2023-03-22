package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o qaunto você ganha por Hora:");
		double ganhoPorHora = scanner.nextDouble();
		
		System.out.println("Digite numero de horas trabalhadas no mês:");
		double horasTrabalhadasNoMes = scanner.nextDouble();
		
		double salario = ganhoPorHora * horasTrabalhadasNoMes;
		
		System.out.println("Seu salário é: " + salario);
		
		
		scanner.close();

	}

}
