package base;

import derivada.Cliente;

public abstract class Grua {
	
	protected abstract int pedirGrua(Cliente id);
	
	protected abstract void cancelarGrua(Cliente id);
	
	protected abstract double estadoGrua(Cliente id);

	protected abstract String getProveedor();
	
}
