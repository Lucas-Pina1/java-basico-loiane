package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o raio do circulo:");
		double raio = scanner.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("A área do circulo é de: " + area);

		scanner.close();

	}

}
