
public class MaximoNumArray {
	public static void prueba (String arg[]) {
		
		int []arreglo ={2,4,5,6,8,1};
		
		int resultado = arregloMayor(arreglo);
		System.out.println(resultado);
	}
	
	public static int arregloMayor(int arreglo[]) {
		
		int maximo = arreglo[0];
		
		for (int i : arreglo ) {
			if (i > maximo) {
				maximo = i;
			}
		}
		return maximo;
	}
}
