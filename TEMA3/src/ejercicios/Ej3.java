package ejercicios;

import java.util.Scanner;

public class Ej3 {
public static void main(String[] args) { 
		int numero;//Variable que guarda el número
		double suma=0; //Variable que guarda la suma
		double cuenta=0;//Variable que llevará la cuenta de los números
		double media; //Variable que llevará la media
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca números positivos para sumar y contar y uno negativo para terminar la suma");
		
		numero = sc.nextInt();//Leemos el primer número
		while (numero>=0) { //Si número es positivo...
		suma += numero; //Sumamos número a suma
		numero = sc.nextInt();//Leemos el primer número
		cuenta++; //Sumamos uno al valor de cuenta	
	}
		
		media = suma/cuenta; //Calculamos la media
		
System.out.println("La media es " + media); //Entregamos el resultado
sc.close();
}
}
