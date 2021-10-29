package derivada;

public class Cliente {

	private double saldo;
	private String red;
	private String nombre;

	public Cliente(String red, double saldoEnCuenta, String nombre) {
		this.nombre = nombre;
		this.red = red;
		this.saldo = saldoEnCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getRed() {
		return red;
	}

	public String getNombre() {
		return nombre;
	}

}
