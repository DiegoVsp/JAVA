package fundamentos;

public class ConversaotipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; //impl�cita	
		System.out.println(a);
		
		
		float b =(float) 1.0;//convers�o expl�cita(CAST)
		System.out.println(b);
		
		int c = 1;
		byte d = (byte)c;		
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}
}
