package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		int n=0;
		String cond = "1";
		while (cond.equals("1")) {
			System.out.println("Digite um n�mero");
			n += entrada.nextInt();
			System.out.println("Deseja inserir algum n�mero? \n1)SIM \n2)N�O");
			cond = entrada.next();
		}
		System.out.println("A soma dos n�meros digitados � "+n);
		System.out.println("Saiu");
		entrada.close();

	}
}
