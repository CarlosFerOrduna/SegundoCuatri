import derivada.CajeroBanelco;
import derivada.CajeroLink;
import derivada.Cliente;

public class Principal {

	public static void main(String[] args) {
		

		CajeroBanelco cajero1 = new CajeroBanelco(7500);
		CajeroLink cajero2 = new CajeroLink(19000);
		Cliente guadalupe = new Cliente("Guadalupe", "Link", 1050);
		Cliente leando = new Cliente("Leando", "Banelco", 1100);
		Cliente santino = new Cliente("Santino", "Banelco", 700);
	
		System.out.println(cajero2.extraer(500, guadalupe) + " " + guadalupe.getSalto());
		System.out.println(cajero2.extraer(10000, santino));
		System.out.println(cajero1.extraer(650, guadalupe) + " " + guadalupe.getSalto());
		System.out.println(cajero1.extraer(110, santino) + " " + santino.getSalto());
		System.out.println(cajero1.transferir(guadalupe, leando, 210));
		System.out.println(cajero1.transferir(santino, leando, 520));
	}

}
