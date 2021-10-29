package base;

import derivada.Cliente;

public abstract class Cajero {

	public abstract String transferir(Cliente cliente, Cliente otroCliente, double montoTransferir);

	public abstract String extraer(Cliente cliente, double montoExtraer);

}
