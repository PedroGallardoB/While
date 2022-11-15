package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int mcd=0;
		int mayor;
		int menor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Calcular máximo común divisor, introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		if (num1==num2){
			
		mcd=num1;
					
		} else {
		mayor = num1>num2? num1:num2;
		menor = num1<num2? num1:num2;
		
		for(int contador=menor;menor%contador==mayor%contador;contador--){
			
				mcd=contador;
			
		}
		
		
	}
		System.out.println("El máximo común divisor es " + mcd);
		sc.close();
		

}
}
