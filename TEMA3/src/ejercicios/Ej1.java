package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		int numero=0;
		int suma=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca números positivos para sumar y uno negativo para terminar la suma");
		
		while (numero>=0) {
		numero = sc.nextInt();
		suma = suma + numero;
		
	}
System.out.println("La suma es " + suma);//Imprimos la respuesta
sc.close();//Cerramos el escáner
}
}