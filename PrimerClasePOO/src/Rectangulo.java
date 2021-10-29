public class Rectangulo {

	private double lado1;
	private double lado2;

	Rectangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return this.lado1;
	}

	public double getLado2() {
		return this.lado2;
	}

	public double calcularPerimetro() {
		double perimetro;

		return perimetro = lado1 * 2 + lado2 * 2;
	}

	public double calcularSuperficie() {
		double superficie;

		return superficie = lado1 * lado2;
	}

}