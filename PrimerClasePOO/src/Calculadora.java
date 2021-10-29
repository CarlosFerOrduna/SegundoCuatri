
public class Calculadora {

	public int sumar(int primerNumero, int segundoNumero) {

		return (primerNumero + segundoNumero);

	}

	public int restar(int primerNumero, int segundoNumero) {

		return (primerNumero - segundoNumero);

	}

	public int multiplicar(int primerNumero, int segundoNumero) {

		return (primerNumero * segundoNumero);

	}

	public int calcularMayor(int primerNumero, int segundoNumero) {

		if (primerNumero > segundoNumero) {
			return primerNumero;
		} else {
			return segundoNumero;
		}

	}

	public int calcularMenor(int primerNumero, int segundoNumero) {
		if (primerNumero > segundoNumero) {
			return primerNumero;
		} else {
			return segundoNumero;
		}

	}
}