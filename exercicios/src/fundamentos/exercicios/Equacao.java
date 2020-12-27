package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Equacao {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Digite o valor de A");
		String b = JOptionPane.showInputDialog("Digite o valor de B");
		String c = JOptionPane.showInputDialog("Digite o valor de C");
		
		double A = Double.parseDouble(a);
		double B = Double.parseDouble(b);
		double C = Double.parseDouble(c);
		
		double delta = Math.pow(B, 2)-4*A*C;
		
		System.out.printf("O delta � %.0f\n",delta);
		
		double x1 = (-B + Math.sqrt(delta))/2*A;
		double x2 = (-B - Math.sqrt(delta))/2*A;
		
		System.out.printf("O resultado da equa��o �: %.0f e %.0f ",x1,x2);
		
		
	}
}
