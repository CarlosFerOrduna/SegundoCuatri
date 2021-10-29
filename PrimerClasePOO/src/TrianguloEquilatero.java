
public class TrianguloEquilatero {

	private double lado;
	private double altura;
	private double base;

	TrianguloEquilatero(double lado, double altura, double base) {
		this.lado = lado;
		this.altura = altura;
		this.base = base;
	}

	public double getLado() {
		return this.lado;
	}

	public double getAltura() {
		return this.altura;
	}

	public double getBase() {
		return this.base;
	}

	public double calcularPerimetro() {
		double perimetro;

		return perimetro = this.lado * 3;

	}
	
	public double calcularSuperficie() {
		double superficie;
		
		return superficie = this.base * this.altura / 2;
	}
}