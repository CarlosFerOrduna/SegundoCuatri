import derivada.CajeroBanelco;
import derivada.CajeroLink;
import derivada.Cliente;

public class Principal {

	public static void main(String[] args) {

		CajeroBanelco cajeroBanelco = new CajeroBanelco(7000);
		CajeroLink cajeroLink = new CajeroLink(9000);
		Cliente santino = new Cliente("link", 1000, "Santino");
		Cliente guadalupe = new Cliente("banelco", 1100, "Guadalupe");
		Cliente leandro = new Cliente("banelco", 1000, "Leandro");

		System.out.println(cajeroLink.extraer(guadalupe, 500) + " " + guadalupe.getSaldo());
		System.out.println(cajeroLink.extraer(santino, 10000));
		System.out.println(cajeroBanelco.extraer(guadalupe, 650) + " " + guadalupe.getSaldo());
		System.out.println(cajeroBanelco.extraer(santino, 100) + " " + santino.getSaldo());
		System.out.println(cajeroBanelco.transferir(guadalupe, leandro, 200) + " " + leandro.getSaldo());
	}

}
