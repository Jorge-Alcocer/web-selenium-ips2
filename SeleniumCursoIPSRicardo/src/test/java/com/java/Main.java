package com.java;

public class Main {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		coche1.llantas = 4;
		coche1.asientos = 5;
		coche1.ac = true;
		coche1.marca = "BMW";
		coche1.modelo = "2020";
		coche1.motor = "Hibrido";
		
		System.out.println("El modelo del coche 1 es: "+ coche1.modelo);
		
		coche1.encendido();
		coche1.acelerar();
		
		Coche coche2 = new Coche(2, 2, "Electrico", false, "Audi", "2021");
		System.out.println("El modelo del coche 2 es: "+ coche2.modelo);
		
		Coche coche3 = new Coche(5, "2022");
		System.out.println("Mi coche 3 tiene "+ coche3.llantas + " Llantas");
		
		// Ejercicio# 5
		
		/*
		 * Crear una clase que se llame Motos y vamos a crear 3 diferentes tipos de motos con estados y comportamientos.
		 */

	}

}
