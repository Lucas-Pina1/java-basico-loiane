package com.loiane.cursojava.aula16e17.labs;

public class Exer09 {

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {

			boolean numeroImpar = i % 2 != 0;

			if (numeroImpar) {

				System.out.println("os numeros impares entre 0 a 50 são: " + i);

			}
		}
	}

}
