package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o nome do dia da semana: ");
		String diaSem = entrada.next();

		//N�o use == com String
		if (diaSem.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (diaSem.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		} else if (diaSem.equalsIgnoreCase("Ter�a")) {
			System.out.println("3");
		} else if (diaSem.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		} else if (diaSem.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		} else if (diaSem.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		} else if (diaSem.equalsIgnoreCase("Sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia Inv�lido");
		}

		entrada.close();
	}
}
