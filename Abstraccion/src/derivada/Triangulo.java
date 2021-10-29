package derivada;

import base.FiguraGeometrica;
public class Triangulo extends FiguraGeometrica {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetro;
		
		perimetro = this.base * 3;
		
		return perimetro;
	}
	
	@Override
	public double calcularArea() {
		double area;
		
		area = this.base * this.altura / 2;
		
		return area;
	}
	
}
