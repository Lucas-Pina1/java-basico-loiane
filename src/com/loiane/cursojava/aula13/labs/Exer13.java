package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o qaunto você ganha por Hora:");
		double ganhoPorHora = scanner.nextDouble();
		
		System.out.println("Digite numero de horas trabalhadas no mês:");
		double horasTrabalhadasNoMes = scanner.nextDouble();
		
		double salario = ganhoPorHora * horasTrabalhadasNoMes;
		
		double pagouINSS = (salario / 100) * 8;
		
		double pagouSindicato = (salario / 100) * 5;
		
		double impostoRenda = (salario / 100) * 11;
		
		double totalDeDescontos = impostoRenda + pagouINSS + pagouSindicato;
		
		double salarioLiquido = salario - totalDeDescontos;
		
		System.out.println("Seu salário bruto é: " + salario);
		System.out.println("Pagou para o INSS: " + pagouINSS);
		System.out.println("Seu salário liquido é: " + salarioLiquido);
			
		scanner.close();

	}

}
