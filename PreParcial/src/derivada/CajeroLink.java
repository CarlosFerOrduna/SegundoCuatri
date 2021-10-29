package derivada;

import base.Cajero;

public class CajeroLink extends Cajero {

	private double saldo;
	private String red = "link";

	public CajeroLink(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String transferir(Cliente cliente, Cliente otroCliente, double montoTransferir) {

		String mensaje = "";

		if (cliente.getRed().equalsIgnoreCase(this.red) && otroCliente.getRed().equalsIgnoreCase(this.red)) {
			if (this.saldo >= montoTransferir) {

				mensaje = "La transferencia se ha realizado con éxito";

			} else {
				mensaje = "El cliente de origen no tiene saldo suficiente para realizar la transferencia";
			}
		} else {
			mensaje = "La red del cliente origen y/o cliente destino no son BANELCO";
		}

		return mensaje;
	}

	@Override
	public String extraer(Cliente cliente, double montoExtraer) {

		String mensaje = "";

		if (this.saldo >= montoExtraer) {
			if (cliente.getRed().equalsIgnoreCase(this.red)) {

				this.saldo = this.saldo - montoExtraer;

				mensaje = "La operación se ha realizado con éxito";
			} else {
				cliente.setSaldo(cliente.getSaldo() + montoExtraer * 0.90);
				;
				mensaje = "La operación se ha realizado con éxito";
			}
		} else {
			mensaje = "El cajero no tiene saldo disponible";
		}

		return mensaje;
	}
	
}
