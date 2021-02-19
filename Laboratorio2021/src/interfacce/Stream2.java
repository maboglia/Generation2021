package interfacce;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		Stream.of("do","re","mi","fa", "sol","la", "si")
			.sorted()
			.forEach(nota -> System.out.println(nota));

		String[] note = {"do","re","mi","fa", "sol","la", "si"};
		Arrays.stream(note).filter(n->n.startsWith("s")).forEach(System.out::print);
		
		
		
	}

}
