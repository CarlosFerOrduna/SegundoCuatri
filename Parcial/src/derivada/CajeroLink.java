package derivada;

import base.Cajero;

public class CajeroLink extends Cajero {

	private String red = "Link";

	private double saldo;

	public CajeroLink(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String extraer(double saldoAExtraer, Cliente cliente) {

		String mensaje = "";
		

		if (this.saldo > saldoAExtraer) {
			if (this.red.equalsIgnoreCase(cliente.getRed())) {
				cliente.setSaldo(cliente.getSalto() + saldoAExtraer * 0.98);
				
				mensaje = "La operación se ha realizado con éxito";
			} else {
				cliente.setSaldo(cliente.getSalto() + saldoAExtraer * 0.88); 

				mensaje = "La operación se ha realizado con éxito";
			}
		} else {
			mensaje = "El cajero no tiene saldo disponible";
		}

		return mensaje;
	}

	@Override
	public String transferir(Cliente redRemitente, Cliente redDestinatario, double saldoAtransferir) {

		String mensaje = "";

		if (this.red.equalsIgnoreCase(redRemitente.getRed()) && this.red.equalsIgnoreCase(redDestinatario.getRed())) {
			if (redRemitente.getSalto() > saldoAtransferir) {
				redDestinatario.setSaldo(redDestinatario.getSalto() + saldoAtransferir);
				;
			} else {
				mensaje = "El cliente de origen no tiene saldo suficiente para realizar la transferencia";
			}
		} else {
			mensaje = "La red del cliente origen y/o cliente destino no son BANELCO";
		}

		return mensaje;
	}

}
