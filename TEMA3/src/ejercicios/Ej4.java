package ejercicios;

import java.util.Scanner;

public class Ej4 {
public static void main(String[] args) {
	
		int numero=1;//Variable que guarda el número
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca números para saber si son pares y cero para finalizar.");
		
		while (numero!=0) { //Si número es positivo...
		numero = sc.nextInt();//Leemos el primer número
		if (numero%2==0) {
		System.out.println("El número es par" );
	} else System.out.println("El número es impar");
		}
System.out.println("Programa finalizado."); //Entregamos el resultado
sc.close();

}
}