package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ej2 {
	public static void main(String[] args) {
		
		int numero; //Variable que leerá los números que introduzca el usuario
		int cuenta=0; //Variable que llevará la cuenta de los números
		Scanner sc = new Scanner(System.in); //Llamamos al escáner
		
		//Damos instrucciones al usuario
		System.out.println("Introduzca números positivos para contarlos y uno negativo para terminar la suma");
		
		numero = sc.nextInt();//Leemos el primer número
		while (numero>=0) {//Si el número es mayor que cero
		numero = sc.nextInt(); //Damos otro valor a número
		cuenta++; //Sumamos uno al valor de cuenta
		
	}
System.out.println("Has introducido " + cuenta + " números"); //Entregamos el resultado
sc.close(); //Cerramos el escáner
}
}