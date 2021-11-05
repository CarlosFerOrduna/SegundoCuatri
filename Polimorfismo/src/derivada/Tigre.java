package derivada;

import base.Zoologico;

public class Tigre extends Zoologico {

	private String colorDePelo;

	public Tigre(String colorDePelo, int edad) {
		this.colorDePelo = colorDePelo;
		this.edad = edad;
	}

	public void dormir() {
		System.out.println("El tigre esta durmiendo");
	}

	public void comer() {
		System.out.println("El tigre esta comiendo");
	}

	public String getColor() {
		return colorDePelo;
	}

	@Override
	public Integer getEdad() {
		return edad;
	}

}
