package interfacce;

import java.util.Arrays;
import java.util.List;

public class ScorriVoti {

	public static void main(String[] args) {
		

		
		
		List<String> lista = Arrays.asList("do", "re", "mi", "fa", "sol", "la", "si");
		
		int somma = 0;
		
//		for (int i = 0; i < voti.length; i++) {
//			somma += voti[i];
//			System.out.println(voti[i]);
//		}
		
//		for (String nota : lista) {
//			if (nota.startsWith("s"))
//				System.out.println(nota);
//		}
		
		
		
		lista
			.stream()
			.filter(s->s.length()<3)
			.filter(s->s.endsWith("a"))
			.forEach(s -> System.out.println(s));
		
		
		System.out.println(somma);
		
		
		
	}

}
