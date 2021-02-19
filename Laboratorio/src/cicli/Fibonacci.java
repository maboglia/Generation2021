package cicli;

public class Fibonacci {

	public static void main(String[] args) {
		

		//fibonacci
		
		final int RIPETIZIONI = 10;
		int temp1 = 0;
		int temp2 = 1;
		int somma = 0;
		
		while (true) {
			somma = temp1+temp2;
			System.out.println(somma);
			
			temp1 = temp2;
			temp2 = somma;
		
		
		if (somma > 300)
			break;
		}
		
		
		

	}

}
