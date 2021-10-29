
public class Vaso {
	private double alto;
	private double diametro;

	Vaso(double alto, double diametro) {
		this.alto = alto;
		this.diametro = diametro;
	}

	public double getAlto() {
		return this.alto;
	}

	public double getDiametro() {
		return this.diametro;
	}

	public double calcularVolumen() {
		double volumen;

		return volumen = this.alto * this.diametro;
	}

}
