
public class Programador {

	public void repetirMensaje(String mensajeARepetir, int cantidadDeRepeticiones) {

		for (int i = 0; i < cantidadDeRepeticiones; i++) {

			System.out.println(mensajeARepetir);

		}
	}

	public boolean sePuedeDividir(int numerador, int denominador) {

		if (denominador != 0) {
			return true;
		} else {
			return false;
		}

	}
}