package derivada;

import base.FiguraGeometrica;

public class Circulo extends FiguraGeometrica{

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetro;
		
		perimetro = 2 * 3.14 * this.radio;
		
		return perimetro;
	}
	
	@Override
	public double calcularArea() {
		double area;
		
		area = 3.14 * this.radio * this.radio;
		
		return area;
	}
	
}
