package com.java;

public class Condicionales {

	public static void main(String[] args) {
		
//		1- If
//		2- If else
//		3- If nested
//		4- If else if
//		5- Switch
		
		// Variables
		int velocidad = 70; // KM/h
		int limiteVelocidad = 80; // KM/h - Avenida
		boolean isCarretera = false;
		
		if(isCarretera==true) {
			limiteVelocidad = 100;
			
			if(velocidad>limiteVelocidad) {
				// Block code
				System.out.println("Carretera - Multa");
			}else {
				System.out.println("Carretera - Manejas bien!!");
			}
			
		}else if(velocidad>limiteVelocidad) {
			// Block code
			System.out.println("Calle - Multa");
		}else {
			System.out.println("Calle - Manejas bien!!");
		}
		
		String iniciales = "XX";
		
		switch(iniciales) {
		case "RIAH":
			System.out.println("Ricardo Ivan Avalos Heredia");
			break;
			
		case "AS":
			System.out.println("Adilene Santiago");
			System.out.println("Alfredo Santoyo");
			break;
			
		case "AN":
			System.out.println("Angel Nunez");
			break;
			
			default:
				System.out.println("Unknown");
				break;
		}
		
		/*
		 * Ejercicio #1
		 * 
		 * 1- Cambiar el tipo de variable de int a double.
		 * 2- Agregar la condicion cuando sea "Zona escolar"
		 */
		
		

	}

}
