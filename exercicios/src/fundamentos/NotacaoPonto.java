package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		
		String s = "Bom dia X"; //String � imut�vel
		
		s= s.replace("X", "Senhora");
		s = s.toUpperCase();
		s=s.concat("!!!");
		
		System.out.println(s);
		
		//System.out.println("Diego".toUpperCase());
		String x = "Diego Vespa".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos n�o tem o operador " . "
	}
}
