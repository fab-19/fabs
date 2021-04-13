package main;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int a;
		int[] n = new int[10];
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado"));
		
		n[0] = a;
		
		for(int i = 1; i < 10; i++) {
			n[i] = n[i - 1] * 2;
		}
		
		
		for(int i = 0; i < 10; i++) {
		
		System.out.println("n[" + i + "] = " + n[i]);
		}
		
	}

}

