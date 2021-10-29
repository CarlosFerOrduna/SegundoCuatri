package base;

import derivada.Cliente;

public abstract class Cajero {
		
	protected abstract String extraer(double saldoAExtraer, Cliente red);
	
	protected abstract String transferir(Cliente redRemitente, Cliente redDestinatario, double saldo);
	
}
