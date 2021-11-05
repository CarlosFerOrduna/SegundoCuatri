package derivada;

import base.Zoologico;

public class Leon extends Zoologico {

	private double peso;

	public Leon(double peso, int edad) {
		this.peso = peso;
		this.edad = edad;
	}

	public void dormir() {
		System.out.println("El leon esta durmiendo");
	}

	public void comer() {
		System.out.println("El leon esta comiendo");
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public Integer getEdad() {
		return edad;
	}

}
