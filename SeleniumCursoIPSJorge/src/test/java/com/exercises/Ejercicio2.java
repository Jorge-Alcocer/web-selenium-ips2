package com.exercises;

public class Ejercicio2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio# 2 - Crear un Contador de 10 - 1
		
		int numero = 10;
		
		//while 
		while(numero>=1) {
			System.out.println("Numero while es: "+numero);
			numero--;
		}
		
		//do While Cuantas veces se tiene que restar un mismo numero para llegar a 1;
		
		int numeroSum = 1;
		int sumTotal =0;
		int count = 0;
		
			do {
				sumTotal = sumTotal + numeroSum;
				count--;
			}while (sumTotal<10);
			System.out.println("El numero se sumo asi mismo: "+count+" veces");
				
			
		
		
		for(int i = 1; i>=numero; i--) {	
		System.out.println("El numero For es: "+ i);
		}
	}

}
