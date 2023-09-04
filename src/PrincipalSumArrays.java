import javax.swing.JOptionPane;

public class PrincipalSumArrays {
	
	public static void main (String arg[]) {
	        SumaArrays miProceso;
	        miProceso = new SumaArrays();

	        int arr1[] = new int[5];
	        int arr2[] = new int[5];
	        for (int i = 0; i < arr1.length; i++) {
	            arr1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
	        }
	        for (int i = 0; i < arr2.length; i++) {
	            arr2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
	        }
	        int sumaArreglos[] = miProceso.sumaArreglos(arr1, arr2);
	        System.out.print("La suma de los dos arreglos ingresados es: ");
	        for (int num : sumaArreglos) {
	            System.out.print(num + " ");
	        }
	}
}


