package app;
import derivada.Circulo;
import derivada.Cuadrado;
import derivada.Rectangulo;
import derivada.Triangulo;
public class Principal {

	public static void main(String[] args) {

		Circulo circulo = new Circulo(5);
		Cuadrado cuadrado = new Cuadrado(5);
		Rectangulo rectangulo = new Rectangulo(2,5);
		Triangulo triangulo = new Triangulo(5,2);
		
		System.out.println("El area del circulo es: " + circulo.calcularArea());
		System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
		System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
		System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
		System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
		System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
		System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
		System.out.println("El area del circulo es: " + circulo.calcularArea());
		System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
		System.out.println("El area del triangulo es: " + triangulo.calcularArea());
	}

}
