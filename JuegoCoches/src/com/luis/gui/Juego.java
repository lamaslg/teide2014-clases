package com.luis.gui;

import com.luis.modelo.Coche;

public class Juego {

	public static void main(String[] args) {
		
		Coche c1=new Coche("Naranja","Keroseno",125,5.5);
		Coche c2=new Coche();
		/*c1.setColor("Rojo");
		c1.setConsumo(6.5);
		*/
		System.out.println("El coche es "+c1.getColor());
		System.out.println(c2.getColor());
		double cons=c1.consumido(23,1.4);
		
		System.out.println(cons);
		
		c1.imprimir();
			}
	
}
