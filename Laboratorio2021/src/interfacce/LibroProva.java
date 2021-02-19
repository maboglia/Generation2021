package interfacce;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibroProva {

	public static void main(String[] args) {
		
//		Libro[] libriArray = {
//				new Libro(10, "Marcovaldo"),
//				new Libro(15, "Albachiara"),
//				new Libro(30, "Zanna Bianca"),
//				new Libro(25, "Barbablù"),
//				new Libro(9, "Serenella"),
//		};
		
		List<Libro> libriList = Arrays.asList(
				new Libro[] {
						new Libro(10, "Marcovaldo"),
						new Libro(15, "Albachiara"),
						new Libro(30, "Zanna Bianca"),
						new Libro(25, "Barbablù"),
						new Libro(9, "Serenella"),	
				}
				
				);
		
		//Comparator<Libro> c = (l1, l2) -> l2.getTitolo().compareTo(l1.getTitolo());
		
		Collections.sort(libriList, (l1, l2) -> l1.getTitolo().compareTo(l2.getTitolo()));

		libriList.forEach(System.out::println);
		
	}

}

