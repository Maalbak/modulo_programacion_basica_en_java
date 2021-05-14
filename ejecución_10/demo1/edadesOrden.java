package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class edadesOrden {

	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);

		int i;
		int[] edades = new int[10];
		
		System.out.println("Ingrese las edades: ");
		for (i = 0; i < 10; i++) {
            System.out.print("edad[" + i + "]= ");
            edades[i]=leer.nextInt();
            
            Arrays.sort(edades);
            System.out.println("Edades mayores de 18 ingresadas en el arrego");
            for(i = 0; i < edades.length; i++) { 
            	System.out.println("edad " + i +" : "+ edades[i]);
            }
            }
            }
	
}



