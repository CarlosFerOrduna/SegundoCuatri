package abstraccion2;

import derivada.Cliente;
import derivada.GruaACA;
import derivada.GruaSOS;

public class Principal {

	public static void main(String[] args) {
		
		GruaSOS gruaJuanCarlos = new GruaSOS();
		GruaACA gruaEsoTilin = new GruaACA();
		Cliente chewbacca = new Cliente();
		
		System.out.println(gruaJuanCarlos.pedirGrua(chewbacca));
		gruaJuanCarlos.cancelarGrua(chewbacca);
		System.out.println(gruaJuanCarlos.estadoGrua(chewbacca));
		System.out.println(gruaJuanCarlos.getProveedor());
	}

}
