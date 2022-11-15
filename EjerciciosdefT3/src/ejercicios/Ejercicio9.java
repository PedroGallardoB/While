package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int div=1;
		int num;
		int decimas = 10;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número mayor que cero: ");
		num = sc.nextInt();
		
		if(num<0) {
			
			System.out.println("Lo siento, el número tiene que ser mayor que cero.");
		
		}els{
			
				while(div<=1) {
					
					 decimas *= 10;
					 div = num/decimas;
				}
		}
		
		System.out.println("El número tiene " + decimas + " dígitos.");
		
		sc.close();
}
}