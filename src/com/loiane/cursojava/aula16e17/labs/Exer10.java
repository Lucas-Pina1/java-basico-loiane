package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite o primeiro numero:");
		num1 = sc.nextInt();

		System.out.println("Digite o segundo numero:");
		num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {

			System.out.println(i);

		}

		sc.close();

	}

}
