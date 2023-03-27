package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int num = sc.nextInt();

		System.out.println("Fatorial de " + num);

		System.out.println(num + "! = ");

		int fatorial = 1;

		for (int i = num; i > 1; i--) {

			fatorial += i;

			System.out.print(" 1 = " + fatorial);

		}

		sc.close();

	}

}
