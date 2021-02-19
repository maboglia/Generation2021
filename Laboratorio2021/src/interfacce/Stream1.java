package interfacce;

import java.util.stream.IntStream;

public class Stream1 {

	public static void main(String[] args) {
		
		//stream di interi
		IntStream.range(0, 100).filter(x -> x%2==0&&x%3==0).forEach(n->System.out.println(n));
		long l = IntStream.range(0, 100).filter(x -> x%2==0&&x%3==0).count();
		System.out.println("Gli interi compresi tra 0 e 99, divisibili per 2 e per 3 sono: "+l);
		

	}

}
