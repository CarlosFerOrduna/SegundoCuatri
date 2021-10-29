package derivada;

import java.util.Random;

import base.Grua;

public class GruaACA extends Grua {

	private String proveedor = "ACA";

	@Override
	public int pedirGrua(Cliente id) {
		Random rnd = new Random();
		
		return id.setId(rnd.nextInt(9999));
	}

	@Override
	public void cancelarGrua(Cliente id) {

		System.out.println("Se a cancelado la grua del " + this.proveedor + " con un id: " + id.getId());
		
	}

	@Override
	public double estadoGrua(Cliente id) {
		
		double tiempoEstimado;
		
		tiempoEstimado = id.getId() * 2;
		
		return tiempoEstimado;
	}

	@Override
	public String getProveedor() {
		return this.proveedor;
	}

}
