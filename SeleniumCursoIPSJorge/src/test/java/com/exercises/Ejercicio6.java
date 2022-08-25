package com.exercises;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printValue(1, 10);
	}

	/*
	 * Genera un método que imprima los números de acuerdo a un rango de números.
	 * El método recibirá dos parámetros enteros “minInterval”, “maxInterval”. 
	 * El método solo tiene que aceptar números positivos
	 */
	
	
	public static void printValue(int minInterval, int maxInterval) {

		if (minInterval >= 1 && maxInterval >= 1) {
			for (int i = minInterval; i <= maxInterval; i++) {
				System.out.println("Valores: " + i);
			}
		} else {
			System.out.println("Son valores negativos");
		}

	}

}
