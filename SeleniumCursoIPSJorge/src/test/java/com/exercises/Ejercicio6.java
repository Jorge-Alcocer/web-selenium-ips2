package com.exercises;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printValue(1, 10);
	}

	/*
	 * Genera un m�todo que imprima los n�meros de acuerdo a un rango de n�meros.
	 * El m�todo recibir� dos par�metros enteros �minInterval�, �maxInterval�. 
	 * El m�todo solo tiene que aceptar n�meros positivos
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
