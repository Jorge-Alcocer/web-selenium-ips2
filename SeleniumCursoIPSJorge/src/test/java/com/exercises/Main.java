package com.exercises;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ejercicio5 moto1 = new ejercicio5("Aluminio","Vinil", "BMW");
		System.out.println("El modelo de mi moto1 es :"+moto1.modelo);
		
		ejercicio5 moto2 = new ejercicio5("Manual","Piel", "Yamaha");
		System.out.println("Tipo de direccion de mi moto 2 es: "+ moto2.direccion);

		ejercicio5 moto3 = new ejercicio5("Manual","Piel", "Ducati");
		System.out.println("La cantidad de llantas de mi moto 3 es: "+ moto3.llantas);
		
		Perro perro1 = new Perro();
		perro1.raza="Chihuahua";
		perro1.sexo="Macho";
		perro1.tamanio="Chico";
		System.out.println("Raza del perro: "+perro1.raza+" | Sexo del perro: "+perro1.sexo+" | Tamaño del perro: "+perro1.tamanio);
		
		Perro perro2 = new Perro();
		perro2.raza="Doberman";
		perro2.sexo="Hembra";
		perro2.tamanio="Grande";
		System.out.println("Raza del perro: "+perro2.raza+"  | Sexo del perro: "+perro2.sexo+"| Tamaño del perro: "+perro2.tamanio);
	}
}