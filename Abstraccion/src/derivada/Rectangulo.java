package derivada;

import base.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

	private double ancho;
	private double alto;
	
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetro;

		perimetro = this.alto * 2 + this.ancho * 2;

		return perimetro;
	}

	@Override
	public double calcularArea() {
		double area;

		area = this.alto * this.ancho;

		return area;
	}

}
