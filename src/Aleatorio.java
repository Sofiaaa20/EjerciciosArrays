

public class Aleatorio {
	
	public static int numAleatorio() {
		
		int numero = (int)(Math.random()*100+1);
		System.out.println("El numero es: "+numero);
		return numero;
	}
}
