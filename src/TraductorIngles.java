
import java.util.HashMap;

import javax.swing.JOptionPane;

public class TraductorIngles {

	
	public static void Traduccion(){
			
		HashMap<String, String> mapaPalabras = new HashMap<String, String>();
		
		mapaPalabras.put("Free", "Gratis");
		mapaPalabras.put("Butter", "Mantequilla");
		mapaPalabras.put("Egg", "Huevo");
		mapaPalabras.put("Cat", "Gato");
		
		String palabra = JOptionPane.showInputDialog("Ingrese la palabra");
		
		if(mapaPalabras.containsKey(palabra)) {
			System.out.println("Si lo contiene");
			System.out.println( palabra +": "+mapaPalabras.get( palabra));
		}
		
	}
}