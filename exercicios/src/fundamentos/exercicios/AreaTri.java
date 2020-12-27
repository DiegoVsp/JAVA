package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTri {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double base, altura, area;
		System.out.println("Entre com o valor da Base do triângulo: ");
		base=entrada.nextDouble();
		
		System.out.println("Entre com o valor da Altura do triângulo: ");
		altura = entrada.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.printf("A área do triângulo é de %.1f",area);
		
		entrada.close();
	}
}
