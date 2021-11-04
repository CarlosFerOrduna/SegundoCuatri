import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import base.Zoologico;
import derivada.CompararAnimales;
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

		Collections.sort(animales, new CompararAnimales());

		for (Zoologico animal : animales) {
			System.out.println(animal.getEdad());
		}

		Collections.sort(animales, new CompararAnimales().reversed());

		for (Zoologico animal : animales) {
			System.out.println(animal.getEdad());
		}

		animales.stream()
			.filter(leon -> leon instanceof Leon && leon.getPeso() > 200)
			.forEach(System.out::println);
		animales.stream()
			.filter(tigre -> tigre instanceof Tigre && tigre.getColor().equalsIgnoreCase("oscuro"))
			.forEach(System.out::println);
		animales.stream()
			.filter(pajaro -> pajaro instanceof Pajaro && pajaro.getAlto() > 200 && pajaro.getEdad() > 35)
			.forEach(System.out::println);
		animales.stream()
			.filter(elefante -> elefante instanceof Elefante && elefante.getLargoTrompa() > 2)
			.forEach(System.out::println);
	}

}
