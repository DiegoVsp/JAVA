package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		//%n j� quebra para a pr�xima linha
		System.out.printf("Megasena %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		System.out.printf("Sal�rio: %.1f%n",1234.4567);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.next();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.next();
		
		System.out.println("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Ol�, meu nome � %s %s e tenho %d anos!",nome, sobrenome,idade);
		
		entrada.close();
	}
}
