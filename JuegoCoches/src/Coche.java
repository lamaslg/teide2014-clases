
public class Coche {

	//Atributos
	private String color;
	private String combustible;
	private int deposito;
	private double consumo;
	
	public Coche(){
		color="nada";
		combustible="nada";
		deposito=0;
		consumo=0;
		
	}
	
	//Creamos el constructor que permite recibir los argumentos del objeto
	public Coche(String _color,String _combustible,int _deposito,double _consumo){
		color=_color;
		combustible=_combustible;
		deposito=_deposito;
		consumo=_consumo;
		
	}
	//Setters y Getters
	public String getColor(){
		return color;
		
	}
	public void setColor(String arg){
		color=arg;
	}
	
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
	public void  imprimir() {
		System.out.println("Coche "+ color+ " consume "+consumo);
		
	}
	
}
