package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		float [] x = new float [20];
		
		Scanner scanner = new Scanner(System.in);
				
		for (int i = x.length - 1; i >= 0; i--)
			{
			System.out.println("Insira o valor para ser trocado com a sua posição inversa no vetor: ");
			x[i] = scanner.nextFloat();
			}
				
		for (int i = 0; i < x.length; i++)
			{
			System.out.println("x[" + i + "] = " + x[i]);
			}

		
		
		
	}

}
