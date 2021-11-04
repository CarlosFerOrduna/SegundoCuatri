package derivada;

import base.Zoologico;

public class Tigre implements Zoologico {

	private String colorDePelo;
	private int edad;

	public Tigre(String colorDePelo, int edad) {
		this.colorDePelo = colorDePelo;
		this.edad = edad;
	}

	@Override
	public void dormir() {
		System.out.println("El tigre esta durmiendo");
	}

	@Override
	public void comer() {
		System.out.println("El tigre esta comiendo");
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
		return colorDePelo;
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
