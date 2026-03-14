package com.pattern;

import java.util.Scanner;

public class DiamondPattern {

	public static void printDiamond(int n) {

		// Upper part of diamond
		for (int i = 1; i <= n; i++) {

			// Print spaces
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			// First star
			System.out.print("*");

			// Print inner spaces and second star
			if (i > 1) {
				for (int j = 1; j <= (2 * i - 3); j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}

		// Lower part of diamond
		for (int i = n - 1; i >= 1; i--) {

			// Print spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			// First star
			System.out.print("*");

			// Print inner spaces and second star
			if (i > 1) {
				for (int j = 1; j <= (2 * i - 3); j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		printDiamond(n);

		scanner.close();
	}
}