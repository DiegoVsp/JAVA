package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double total = 0, nota = 0;
		int quantNota = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota (ou -1 p/sair): ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total += nota;	
				quantNota++;
			} else if(nota != -1) {
				System.out.println("Digite uma nota válida");
			}
			
		}

		double media = total / quantNota;
		System.out.println(media);

		entrada.close();
	}
}
