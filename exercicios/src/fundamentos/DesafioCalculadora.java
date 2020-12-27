package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float valor1, valor2, resultado;
		String op;

		System.out.println("Digite o primeiro valor: ");
		valor1 = Float.parseFloat(entrada.nextLine());

		System.out.println("Digite a operação: ");
		op = entrada.nextLine();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = Float.parseFloat(entrada.nextLine());


		resultado = "+".equals(op) ? valor1 + valor2 : 0;
		resultado = "-".equals(op) ? valor1 - valor2 : resultado;
		resultado = "*".equals(op) ? valor1 * valor2 : resultado;
		resultado = "/".equals(op) ? valor1 / valor2 : resultado;
		resultado = "%".equals(op) ? valor1 % valor2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f", valor1, op, valor2, resultado);

		entrada.close();
	}
}
