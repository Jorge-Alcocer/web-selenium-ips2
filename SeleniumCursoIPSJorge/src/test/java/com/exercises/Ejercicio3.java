package com.exercises;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Ejercicio #3 - Crear un arreglo unidimensional (como objeto de 4 posiciones)
			1.- First Name
			2.- Middle Name
			3.- Last Name
			4.- Edad
			Imprimir el arreglo concatenando sus valores
		*/

	
		String [] alumno = new String[4];
		alumno [0] = "Jorge";
		alumno [1] = "G";
		alumno [2] = "Alcocer";
		alumno [3] = Integer.toString(41);
		System.out.println("First Name: "+alumno[0]+ " | Middle Name: "+ alumno[1]+ " | Last Name: "+alumno[2]+ " | Edad: "+alumno[3]);
	
		
		
	}

}
