package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		// Trabalho na Ter�a (V OU F)
		// Trabalho na Quinta(V OU F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = comprouTv32 || comprouTv50;
		
		//Operador Un�rio
		boolean maisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou Tv 50\"? "+comprouTv50);
		System.out.println("Comprou Tv 32\"? "+comprouTv32);
		System.out.println("Comprou Sorvete\"? "+tomouSorvete);
		
		System.out.println("Mais Saud�vel? "+maisSaudavel);
	}
}
