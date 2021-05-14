package demo1;
//Crear una aplicacion que reciba un numero y luego indique 
//cuantos numeros pares existen entre el 2 y el numero ingresado
import java.util.Scanner;
public class clasFor {

 public static void main(String[] args) {
	 
	 Scanner leer = new Scanner(System.in);
	 System.out.println("Ingrese un número: ");
	 int n = leer.nextInt();
     int cantPares = 0;
     

     for(int i =2; i <= n; i+=2) {
    	 cantPares++;
     }

     System.out.printf("La cantidad de numeros pares entrados fue de ", +cantPares+);
}
}
