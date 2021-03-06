package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "3");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); //equals vai comparar os conteudos
		
		Scanner entrada = new Scanner(System.in);
			
			String s2 = entrada.next(); 
			//next j� retira todos os espa�os em branco
			//nextLine imprime o conteudo com os espa�os em branco
			System.out.println("2" == s2.trim()); // trim() retira espa�os em branco
			System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
