package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		
		 int a = 0, gasolina = 0, alcool = 0, diesel = 0 ;

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("digite o código dos produtos utilizados: ");

	        while (a != 4) {

	            a = scanner.nextInt();

	            if(a == 1) {
	                alcool ++;
	            }
	            if(a == 2) {
	                gasolina ++;
	            }
	            if(a == 3) {
	                diesel ++;
	            }
	    }
	        System.out.println("MUITO OBRIGADO");
	        System.out.println("Alcool: " + alcool);
	        System.out.println("Gasolina: " + gasolina);
	        System.out.print("Diesel: " + diesel);
		scanner.close();
	}

}
