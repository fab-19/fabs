package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		

		String seq = "";
		int num, a, b, res;
        b = 0;
        res = 0;
        
        
      
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        
        if(a > 0 && num > 0) 
        {

            if(a > num ) 
            	{
                	b = a;
                	a = num;
                	num = b;
            	}
        
            for(int i = a; i <= num; i++) 
            {
            	seq = seq + i + " ";
                res = res + i;
            }
            
            	JOptionPane.showMessageDialog(null, seq + " = " + res);
            	seq = "";
            	res = 0;
            	b = 0;
        }
		
	}

}
