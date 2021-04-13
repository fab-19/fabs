package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		

		int x, y;
		String a = "";
		
		do {

		x = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros que serão testados (max = 1007)"));

		} while((x < 1) || (x > 100));
		
		for (int i = 1; i <= x; i++) {
		
		
					
					 y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
					
			
			if (y == 2)
			{
				a += y + " e um numero primo" + "\n"; 
			
			}
			else if ((y/y == 1) && (y/1 == y) && ((y % 2 == 0) || (y % 3 == 0) || (y % 5 == 0)))
			{
				a += y + " não e um numero primo" + "\n"; 
				
			}
			
			else 
			{
				a += y + " e um numero primo" + "\n"; 
			
			}
		
		}
		JOptionPane.showMessageDialog(null, a);
		
	}

}
