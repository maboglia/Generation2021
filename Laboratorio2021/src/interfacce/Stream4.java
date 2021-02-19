package interfacce;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4 {
	public static void main(String[] args) {
		try {
			Stream<String> auto = Files.lines(Paths.get("documenti/auto.csv"));
			
			List<Integer> vendite = auto
			.map(a->a.split(","))
			.map(a->Integer.parseInt(a[1]))
			.collect(Collectors.toList());
			
			
			int i = auto
					.map(a->a.split(","))
					.map(a->Integer.parseInt(a[1]))
					.reduce(0,(acc,elem)->acc+elem);
			System.out.println(i);
			
//			.reduce(0, (acc, elem[1]) -> acc + elem[1]);
			
			
//			forEach(a->System.out.println(a[0] +": "+a[1]));
			
			//nani.forEach(n->System.out.println(n));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
