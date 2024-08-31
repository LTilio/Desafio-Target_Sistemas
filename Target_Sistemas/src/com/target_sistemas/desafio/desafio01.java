package com.target_sistemas.desafio;

import java.util.Scanner;

public class desafio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
		int number = sc.nextInt();

		boolean bolengsFibonacci = isFibonacci(number);

		if (bolengsFibonacci) {
			System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
		}

	}

	public static boolean isFibonacci(int n) {
		int a = 1;
		int b = 0;

		if (n < 0) {
			return false;
		}

		if (n == a || n == b) {
			return true;
		}

		for (int c = a + b; c <= n; c = a + b) {
			if (c == n) {
				return true;
			}
			a = b;
			b = c;
		}

		return false;
	}

}
