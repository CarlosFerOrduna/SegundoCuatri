package derivada;

import base.Vehiculo;

public class Taxi extends Vehiculo{

	private int numeroLicencia;
	
	private Taxi(int numeroLicencia, String patente, String modelo, int cantidadRuedas, String tipoCombustible) {
		
		super(patente, modelo, cantidadRuedas, tipoCombustible);
		
		this.numeroLicencia = numeroLicencia;
		
	}
	
	public int getNumeroLicencia() {
		return this.numeroLicencia; 
	}
	public String getPatente() {
		return super.patente;
	}
	public String getModelo() {
		return super.modelo;
	}
	public int getCantidadRuedas() {
		return super.cantidadRuedas;
	}
	public String getTipoCombustible() {
		return super.tipoCombustible;
	}
	
	public void getAbrirPuerta() {
		super.abrirPuerta();
	}
}
