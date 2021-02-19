package collezioni;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		
		Set<String> note = new HashSet<>();
		note.add("do");
		note.add("fa");
		note.add("re");
		note.add("mi");
		note.add("fa");
		
		
		
		System.out.println(note.size());
		for (String nota : note) {
			System.out.println(nota);
		}
		
		Set<String> note2 = new TreeSet<>();

		note2.add("do");
		note2.add("re");
		note2.add("mi");
		note2.add("fa");
		note2.add("fa");
		
		System.out.println(note2.size());
		for (String nota : note2) {
			System.out.println(nota);
		}
		
	}

}
