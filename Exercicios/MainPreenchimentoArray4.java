package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double [] x = new double [100];
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Insira o valor para ser dividido: ");	
		x[0] = scanner.nextDouble();
			
		System.out.println("x[" + 0 + "] = " + x[0]);
				
		for (int i = 1; i < x.length; i++) 
			{
				x[i] = x[i-1] / 2;
				System.out.println("x[" + i + "] = " + x[i]);
			}

	}

}
