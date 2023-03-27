package com.loiane.cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = sc.nextInt();

		boolean primo = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Não é primo - divisivel por " + i);
			}
		}

		if (primo) {
			System.out.println("É numero primo");
		}

		sc.close();

	}

}
