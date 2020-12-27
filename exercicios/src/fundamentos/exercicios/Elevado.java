package fundamentos.exercicios;

import java.util.Scanner;

public class Elevado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor, quad, cubo;
		
		System.out.println("Digite um valor: ");
		valor=entrada.nextDouble();
		
		quad = Math.pow(valor, 2);
		cubo = Math.pow(valor, 3);
		
		System.out.println(quad+" "+cubo);
		
		entrada.close();
	}
}
