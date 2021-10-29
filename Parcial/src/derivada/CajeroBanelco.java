package derivada;

import base.Cajero;

public class CajeroBanelco extends Cajero {

	private String red = "Banelco";

	private double saldo;

	public CajeroBanelco(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String extraer(double saldoAExtraer, Cliente cliente) {

		String mensaje = "";
		

		if (this.saldo > saldoAExtraer) {
			if (this.red.equalsIgnoreCase(cliente.getRed())) {
				cliente.setSaldo(cliente.getSalto() + saldoAExtraer);
				
				mensaje = "La operaci�n se ha realizado con �xito";
			} else {
				cliente.setSaldo(cliente.getSalto() + saldoAExtraer * 0.87); 

				mensaje = "La operaci�n se ha realizado con �xito";
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
