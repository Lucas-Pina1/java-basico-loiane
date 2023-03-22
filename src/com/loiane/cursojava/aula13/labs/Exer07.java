package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o lado do quadrado:");
		double lado = scanner.nextDouble();

		double area = Math.pow(lado, 2);

		double dobroDaArea = area * 2;

		System.out.println("A área do quadrado é: " + area + " e o dobro da area é: " + dobroDaArea);
		
		scanner.close();
	}
}
