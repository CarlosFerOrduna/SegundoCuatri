package derivada;

import base.Zoologico;

public class Elefante extends Zoologico {

	private double tamanioDeTrompa;

	public Elefante(double tamanioDeTrompa, int edad) {
		this.tamanioDeTrompa = tamanioDeTrompa;
		this.edad = edad;
	}

	public void dormir() {
		System.out.println("El elefante esta durmiendo");
	}

	public void comer() {
		System.out.println("El elefante esta comiendo");
	}

	public double getLargoTrompa() {
		return tamanioDeTrompa;
	}

	@Override
	public Integer getEdad() {
		return edad;
	}

}
