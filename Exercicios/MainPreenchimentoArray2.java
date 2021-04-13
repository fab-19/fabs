package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float[] n = new float[10];

        Scanner scanner = new  Scanner(System.in);
		      
			 for(int i = 0; i < n.length; i++) 
			 {
			 System.out.println("Insira os valores desejados:");
			  n[i] = scanner.nextInt();	            
			  }
			        
			 for(int i = 0; i < n.length; i++) 
			 {           
			 if( n[i] <= 10) 
			 {	 
			 System.out.println("n[" + i + "] = " + n[i]);
			       }
			            
		     }
		
	}

}
