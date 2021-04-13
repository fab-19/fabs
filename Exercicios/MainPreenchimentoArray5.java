package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        double X = scanner.nextDouble();
        double[] N = new double[100];
        
        N[0] = X;
        for (int i = 1; i < N.length; i++) {
        	N[i] = N[i - 1] / 2.0000;
        }
        for (int i = 0; i < N.length; i++) {
        	System.out.println("x[" + i + "] = " + N[i]);
        }

	}

}
