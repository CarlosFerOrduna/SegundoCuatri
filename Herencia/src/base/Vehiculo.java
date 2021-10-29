package base;

public class Vehiculo {

	protected String patente;
	protected String modelo;
	protected int cantidadRuedas;
	protected String tipoCombustible;
	
	protected Vehiculo(String patente, String modelo, int cantidadDeRuedas, String tipoCombustible) {
		this.patente = patente;
		this.modelo = modelo;
		this.cantidadRuedas = cantidadDeRuedas;
		this.tipoCombustible = tipoCombustible;
	}
	
	protected void abrirPuerta() {
		System.out.println("Se esta abriendo la puerta.");
	}
}
