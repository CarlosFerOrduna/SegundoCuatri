public class Cuadrado {

	private double lado;

	Cuadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return this.lado;
	}

	public double calcularPerimetro() {
		double perimetro;

		return perimetro = lado * 4;
	}

	public double calcularSuperficie() {
		double superficie;

		return superficie = lado * lado;
	}

}