package derivada;

public class Cliente {

	private String nombre;
	
	private String red;
	
	private double saldo;
	
	public Cliente(String nombre, String red, double saldo) {
		this.nombre = nombre;
		this.red = red;
		this.saldo = saldo;
	}
	
	public double getSalto() {
		return this.saldo;
	}
	public String getRed() {
		return this.red;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
