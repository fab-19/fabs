import javax.swing.JOptionPane;



public class Impares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

				int a, b, c, res;
				
				c= 0;
				res = 0;
				
				 a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
			     b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
			     
			    if (b > a) 
			    {
			    	c = b;
			    	b = a;
			    	a = c;
			    }
			    
			    for (int i = b + 1; i < a; i++) 
			    {
			    	if (i % 2 != 0) 
			    	{
			    		res = res + i;
			    	}
			    	
			    }
			    
			    JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + b + " e " + a + " é igual a: " + res);
			

			}

	}
