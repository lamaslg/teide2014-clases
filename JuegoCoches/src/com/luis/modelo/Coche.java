package com.luis.modelo;

public class Coche extends Vehiculo {

	
	//Atributos
	private String combustible;
	private int deposito;
	private double consumo;
	
	public Coche(){
		
		combustible="nada";
		deposito=0;
		consumo=0;
		
	}
	
	//Creamos el constructor que permite recibir los argumentos del objeto
	public Coche(String _combustible,int _deposito,double _consumo){
		combustible=_combustible;
		deposito=_deposito;
		consumo=_consumo;
		
	}
	
	//Constructor con super clase
	public Coche(String marca, String modelo, String color, String numeroSerie,
			String combustible, int deposito, double consumo) {
		super(marca, modelo, color, numeroSerie);
		this.combustible = combustible;
		this.deposito = deposito;
		this.consumo = consumo;
	}

	
	
	
	
	
	//Setters y Getters
	
	public String getCombustible() {
		return combustible;
	}
	
	

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double consumido(double kms){
		//como tengo litros por 100 km, calculo cuantas unidades de 100 km recorridas
		double kmsrec=kms/100;
		
		
		return kmsrec*consumo;		
	}
	public double consumido(double kms,double precio){
		//Quiero lo que cuesta el trayecto, le doy km y precio litro
		double kmsrec=kms/100;
		
		
		return kmsrec*consumo*precio;		
	}
	public void imprimir(){
		super.imprimir();
		
		System.out.println(" que consume "+consumo);
		
	}
	
	
}
