package derivada;

import base.Zoologico;

public class Elefante implements Zoologico {

	private double tamanioDeTrompa;
	private int edad;

	public Elefante(double tamanioDeTrompa, int edad) {
		this.tamanioDeTrompa = tamanioDeTrompa;
		this.edad = edad;
	}

	@Override
	public void dormir() {
		System.out.println("El elefante esta durmiendo");
	}

	@Override
	public void comer() {
		System.out.println("El elefante esta comiendo");
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public double getPeso() {
		return 0;
	}

	@Override
	public String getColor() {
		return null;
	}

	@Override
	public double getLargoTrompa() {
		return tamanioDeTrompa;
	}

	@Override
	public double getAlto() {
		return 0;
	}

}
