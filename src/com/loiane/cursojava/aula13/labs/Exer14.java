package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Tamanho do arquivo em MB:");
		double arquivo = scanner.nextDouble();
		
		System.out.println("Digite a velocidade da internet em Mbps:");
		double velocidade = scanner.nextDouble();
		
		double tempoDeDownload = arquivo / velocidade ;
		
		
		System.out.println("O aruivo vai demorar " + tempoDeDownload + " minutos para baixar");
		
		scanner.close();

	}

}
