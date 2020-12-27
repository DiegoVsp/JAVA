package fundamentos.exercicios;

import java.util.Scanner;

public class ConverterParaCel {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double fa, cel;
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fa=entrada.nextDouble();
		
		cel = (fa-32)*5/9;
		
		System.out.printf("A temperatura em Celsius é de %.2f",cel);
		
		entrada.close();
	}
}
