

import java.util.ArrayList;

public class SumaArrayList{

	    public int encontrarMaximo(ArrayList<Integer> lista) {
	        int maximo = lista.get(0);

	        for (int numero : lista) {
	            if (numero > maximo) {
	                maximo = numero;
	            }
	        }
	        return maximo;
	    }

	public void prueba() {
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(12);
        listaDeNumeros.add(4);
        listaDeNumeros.add(45);
        listaDeNumeros.add(8);
        listaDeNumeros.add(17);
        int resultado = encontrarMaximo(listaDeNumeros);
        System.out.println("El valor máximo del arreglo es: " + resultado);

	}
}
