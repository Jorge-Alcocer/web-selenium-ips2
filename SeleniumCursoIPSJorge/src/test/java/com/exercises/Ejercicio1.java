package com.exercises;

public class Ejercicio1 {
	
	/*Ejercicio #1
	 * 1.- Cambiar el tipo de variable de int a double.
	 * 2.- Agregar la condicion cuando sea Zona Escolar.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double 	velocidad = 110.32;
	int 	dv = (int) velocidad;
	int 	limiteVelocidad = 80;
	double 	lv = limiteVelocidad;
	
	boolean isCarretera = false;
	boolean isEscolar = true;
	
		if(isCarretera) {
			lv = 100;
	 
		if(dv>lv) {
			//Block code
			System.out.println("Multa "+dv);
			
		}else {
			System.out.println("Manejas bien! "+dv);
		}
		}
		else if(isEscolar) {
			lv = 30;
			if(dv>lv) {
				System.out.println("Zona Escolar - Calle - Multa "+dv);	
			}
			
		else {
			System.out.println("Zona Escolar - Calle - Manejas bien! "+dv);
			}
		}
	}
}