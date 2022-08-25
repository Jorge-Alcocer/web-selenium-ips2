package com.exercises;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* Crear un metodo que imprima la multipicacion de 3 numeros
		   - Metodo tipo Void
		*/

		int Total = multiplicacion (2,3,4);
		System.out.println("La multiplicacion de los 3 numeros es: "+ Total);
		
		
	}
	
		public static int multiplicacion(int a, int b, int c){
		
			int multiply = a*b*c; 
			return multiply;
	
			
				
	}

}
