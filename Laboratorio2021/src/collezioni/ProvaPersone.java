package collezioni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProvaPersone {

	public static void main(String[] args) {
		List<Persona> persone = new ArrayList<>();

		persone.add(new Persona("Paperoga", "Giovanni"));
		persone.add(new Persona("Paolino", "Aperino"));
		persone.add(new Persona("Andrea", "Pippo"));
		
		Collections.sort(persone);
		for (Persona persona : persone) {
			System.out.println(persona);
		}
		
	}

}
