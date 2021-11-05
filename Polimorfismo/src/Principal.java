import java.util.ArrayList;
import java.util.List;

import base.Zoologico;
import derivada.Elefante;
import derivada.Leon;
import derivada.Pajaro;
import derivada.Tigre;

public class Principal {

	public static void main(String[] args) {

		List<Zoologico> animales = new ArrayList<Zoologico>();

		animales.add(new Leon(201, 10));
		animales.add(new Leon(130, 12));
		animales.add(new Leon(150, 15));
		animales.add(new Tigre("oscuro", 10));
		animales.add(new Tigre("claro", 10));
		animales.add(new Pajaro(250, 34));
		animales.add(new Pajaro(433, 75));
		animales.add(new Pajaro(111, 15));
		animales.add(new Pajaro(220, 36));
		animales.add(new Elefante(3.5, 70));

		animales.sort((a1, a2) -> a1.getEdad().compareTo(a2.getEdad()));

		for (Zoologico animal : animales) {
			System.out.println(animal.getEdad());
		}

		animales.sort((a1, a2) -> a2.getEdad().compareTo(a1.getEdad()));

		for (Zoologico animal : animales) {
			System.out.println(animal.getEdad());
		}

		for (Zoologico animal : animales) {
			if (animal instanceof Leon && ((Leon) animal).getPeso() > 200) {
				System.out.println(((Leon) animal).getPeso());
			}
			if (animal instanceof Tigre && ((Tigre) animal).getColor().equalsIgnoreCase("oscuro")) {
				System.out.println(((Tigre) animal).getColor());
			}
			if (animal instanceof Pajaro && ((Pajaro) animal).getAlto() > 200 && ((Pajaro) animal).getEdad() > 35) {
				System.out.println(((Pajaro) animal).getAlto() + ((Pajaro) animal).getEdad());
			}
			if (animal instanceof Elefante && ((Elefante) animal).getLargoTrompa() > 2) {
				System.out.println(((Elefante) animal).getLargoTrompa());
			}
		}
	}

}
