package derivada;

import base.Zoologico;

public class Pajaro implements Zoologico {

	private double alturaMaxima;
	private int edad;

	public Pajaro(double alturaMaxima, int edad) {
		this.alturaMaxima = alturaMaxima;
		this.edad = edad;
	}

	@Override
	public void dormir() {
		System.out.println("El pajaro esta durmiendo");
	}

	@Override
	public void comer() {
		System.out.println("El pajaro esta comiendo");
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
		return 0;
	}

	@Override
	public double getAlto() {
		return alturaMaxima;
	}

}
