package derivada;

import base.Zoologico;

public class Leon implements Zoologico {

	private double peso;
	private int edad;

	public Leon(double peso, int edad) {
		this.peso = peso;
		this.edad = edad;
	}

	@Override
	public void dormir() {
		System.out.println("El leon esta durmiendo");
	}

	@Override
	public void comer() {
		System.out.println("El leon esta comiendo");
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public String getColor() {
		return null;
	}

	@Override
	public double getLargoTrompa() {
		return 0;
	}

	@Override
	public double getAlto() {
		return 0;
	}

}
