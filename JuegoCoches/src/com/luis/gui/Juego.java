package com.luis.gui;

import com.luis.modelo.Coche;

public class Juego {

	public static void main(String[] args) {
		
		Coche c1=new Coche("Keroseno",125,5.5);
		Coche c2=new Coche();
		
		
		
		Coche c3=new Coche("Toyota", "Yaris", "Gris", "23456", "Gasoil",
					45, 5.5);
		
		
		/*c1.setColor("Rojo");
		c1.setConsumo(6.5);
		*/
		System.out.println("El coche es "+c1.getColor());
		System.out.println(c2.getColor());
		double cons=c1.consumido(23,1.4);
		
		System.out.println(cons);
		System.out.println(c1.getMarca());
		c1.imprimir();
		c3.imprimir();
			}
	
}
