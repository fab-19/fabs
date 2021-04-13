package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		

		int b, y, z;

        String x = "";
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        if( (b <= 1) || (b >= 1000) ) 
        	{
        	JOptionPane.showMessageDialog(null,"O Numero digitado e invalido!");
        		System.out.println("O Numero digitado e invalido!");
            
        	}
        
        else 
        {
        	for(int i = 1; i <= b; i++) 
        	{

        		y = i * i;
        		z = y * i;

        		x = i + " " + y + " " + z;
        		
        		JOptionPane.showMessageDialog(null, x);	
        		System.out.println(x);
        	}

        }

		
	}

}
