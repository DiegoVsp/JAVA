package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.println("Digite seu peso: ");
		String p = entrada.next().replace(",", ".");
		peso = Double.parseDouble(p);
		
		System.out.println("Digite sua altura: ");
		String a = entrada.next().replace(",",".");
		altura=Double.parseDouble(a);
		
		imc = peso/Math.pow(altura, 2);
		
		System.out.printf("Seu IMC é de %.2f",imc);
		
		entrada.close();
	}
}
