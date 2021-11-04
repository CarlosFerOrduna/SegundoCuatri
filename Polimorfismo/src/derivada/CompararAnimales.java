package derivada;

import java.util.Comparator;

import base.Zoologico;

public class CompararAnimales implements Comparator<Zoologico> {

	@Override
	public int compare(Zoologico o1, Zoologico o2) {

		if (o1.getEdad() > o2.getEdad()) {
			return -1;
		} else if (o1.getEdad() < o2.getEdad()) {
			return 1;
		} else {
			return 0;
		}
	}

}
