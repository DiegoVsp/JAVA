package fundamentos.exercicios;

import java.util.Scanner;

public class ConverterParaFahre {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double c, fa;
		
		System.out.println("Digite a temperatura em Celsius");
		c = entrada.nextDouble();
		
		fa = (c*9/5)+32;
		
		System.out.printf("A temperatura convertida para Fahrenheit � %.1f",fa);
		
		entrada.close();
	}
}
