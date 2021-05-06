package demo1;

import java.util.Scanner;

public class clas1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		System.out.println("Ingrese primer número");
		numero1 = lector.nextInt();
		System.out.println("Ingrese segundo número");
		numero2 = lector.nextInt();
		System.out.println("Ingrese segundo número");
		numero3 = lector.nextInt();
		if (numero1 > numero2&& numero2 > numero3)
		System.out.print("El orden de mayor a menor es: "  +numero1+ " " +numero2+ " " +numero3 );
		else if (numero2 > numero1&& numero1 > numero3)
			System.out.print("El orden de mayor a menor es: " +numero2+ " " +numero1+" " +numero3 );
		else if (numero3 > numero2&& numero2 > numero1)
			System.out.print("El orden de mayor a menor es: " +numero3+ " " +numero2+ " " +numero1 );
		else if (numero1 > numero3&& numero3 > numero2)
			System.out.print("El orden de mayor a menor es: " +numero1+ " " +numero3+ " " +numero2 );
		else if (numero3 > numero1&& numero1 > numero2)
			System.out.print("El orden de mayor a menor es: " +numero3+ " " +numero1+ " " +numero2 );
		else if (numero2 > numero3&& numero3 > numero1)
			System.out.print("El orden de mayor a menor es: " +numero2+ " " +numero3+ " " +numero1 );
		else{System.out.print("Intente nuevamente");}
		
		if (numero1 < numero2&& numero2 < numero3)
			System.out.print(" Y el orden de menor a mayor es: "  +numero1+ " " +numero2+ " " +numero3 );
			else if (numero2 < numero1&& numero1 < numero3)
				System.out.print(" Y el orden de menor a mayor es: " +numero2+ " " +numero1+" " +numero3 );
			else if (numero3 < numero2&& numero2 < numero1)
				System.out.print(" Y el orden de menor a mayor es: " +numero3+ " " +numero2+ " " +numero1 );
			else if (numero1 < numero3&& numero3 < numero2)
				System.out.print(" Y el orden de menor a mayor es: " +numero1+ " " +numero3+ " " +numero2 );
			else if (numero3 < numero1&& numero1 < numero2)
				System.out.print(" Y el orden de menor a mayor es: " +numero3+ " " +numero1+ " " +numero2 );
			else if (numero2 < numero3&& numero3 < numero1)
				System.out.print(" Y el orden de menor a mayor es: " +numero2+ " " +numero3+ " " +numero1 );
			else{System.out.print("Intente nuevamente");}
		lector.close();
		
	}
}
