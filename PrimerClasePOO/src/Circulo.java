public class Circulo {
	private double radio;

	Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return this.radio;
	}

	public double calcularPerimetro() {
		double perimetro;

		return perimetro = 3.14 * radio * 2;
	}

	public double calcularSuperficie() {
		double superficie;

		return superficie = 3.14 * radio * radio;
	}

}