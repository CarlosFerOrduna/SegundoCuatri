package derivada;

import base.Zoologico;

public class Pajaro extends Zoologico {

	private double alturaMaxima;

	public Pajaro(double alturaMaxima, int edad) {
		this.alturaMaxima = alturaMaxima;
		this.edad = edad;
	}

	public void dormir() {
		System.out.println("El pajaro esta durmiendo");
	}

	public void comer() {
		System.out.println("El pajaro esta comiendo");
	}

	public double getAlto() {
		return alturaMaxima;
	}

	@Override
	public Integer getEdad() {
		return edad;
	}

}
