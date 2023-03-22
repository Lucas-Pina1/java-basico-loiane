package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite primeiro numero inteiro:");
		int numeroInt1 = scanner.nextInt();
		
		System.out.println("Digite segundo numero inteiro:");
		int numeroInt2 = scanner.nextInt();
		
		System.out.println("Digite um numero real:");
		double numeroReal = scanner.nextDouble();

		int produtoDodobroPrimeiroComMetadeDoSegundo = (numeroInt1 * 2) * (numeroInt2 / 2);
		double somaDoTriploDoPrimeiroComOTerceiro = (numeroInt1 * 3) + numeroReal;
		double terceiroElevedoAoCubo = Math.pow(numeroReal, 3);

		System.out.println("O produto do dobro do primeiro com metade do segundo: " + produtoDodobroPrimeiroComMetadeDoSegundo);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + somaDoTriploDoPrimeiroComOTerceiro);
		System.out.println("O terceiro elevado ao cubo: " + terceiroElevedoAoCubo);

		scanner.close();

	}

}
