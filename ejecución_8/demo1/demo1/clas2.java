package demo1;
//Crear un aplicación en java que permita pedir un numero al 
//usuario y luego mostrar el factorial del numero ingresado

import java.util.Scanner;

public class clas2 {
 
	public static void main(String[]args) {
		
		int numero;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		numero = lector.nextInt();
        lector.close();
        int fact = 1;
        int i = 1;
        while(i<=numero)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("El factorial del "+numero+" es: "+fact);
    }
	
}
