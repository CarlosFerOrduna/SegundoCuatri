package derivada;

import base.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {

	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
		
	@Override
	public double calcularPerimetro() {

		double perimetro;

		perimetro = lado * 4;

		return perimetro;
	}

	@Override
	public double calcularArea() {

		double area;

		area = lado * lado;

		return area;
	}

}
