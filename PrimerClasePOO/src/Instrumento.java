public class Instrumento {
	public String tipo;

	public void tocar(String tipoDeInstrumento, String tieneCuerdas) {

		if (tipoDeInstrumento.equalsIgnoreCase("guitarra") && tieneCuerdas.equalsIgnoreCase("si")) {

			System.out.println("Usted esta tocanto una guitarra y tiene cuerdas");

		} else if (tipoDeInstrumento.equalsIgnoreCase("violin") && tieneCuerdas.equalsIgnoreCase("si")) {

			System.out.println("Usted esta tocanto un violin y tiene cuerdas");

		} else if (tipoDeInstrumento.equalsIgnoreCase("piano") && tieneCuerdas.equalsIgnoreCase("si")) {
			
			System.out.println("Usted esta tocanto un piano y tiene cuerdas");
			
		}
	}
}