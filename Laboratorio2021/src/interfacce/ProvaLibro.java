package interfacce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProvaLibro {

	public static void main(String[] args) {
		
		List<Libro> libreria = new ArrayList<Libro>();
		
		libreria.add(new Libro(100, "Io, robot"));
		libreria.add(new Libro(150, "Guerra e pace"));
		libreria.add(new Libro(50, "Malavoglia"));
		
//		for (int i = 0; i < libreria.size(); i++) {
//			System.out.println(libreria.get(i).getTitolo().toUpperCase());
//		}
//		
//		for (Libro libro : libreria) {
//			System.out.println(libro.getTitolo().toUpperCase());
//		}
		
		Collections.sort(libreria);
		
		libreria
			.stream()
			//.filter(l->l.getTitolo().contains("r"))
			.forEach(l -> System.out.println(l.getTitolo().toUpperCase()));
		
//		ComparaPerTitolo cpt = new ComparaPerTitolo();
		
		Collections.sort(libreria, (unLibro, unAltroLibro) -> unLibro.getTitolo().compareTo(unAltroLibro.getTitolo()));
		System.out.println("Libri ordinati per titolo");
		libreria.forEach(l->System.out.println(l));
		
		Collections.sort(libreria, (unLibro, unAltroLibro) -> unAltroLibro.getTitolo().compareTo(unLibro.getTitolo()));
		System.out.println("Libri ordinati per titolo desc");
		libreria.stream().filter(l->l.getPagine()>50).filter(l->l.getPagine()<120).forEach(System.out::println);
		
		
		
	}

}


