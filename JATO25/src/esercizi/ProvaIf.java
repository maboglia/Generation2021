package esercizi;

public class ProvaIf {

	public static void main(String[] args) {
		
		double casuale = Math.random();
		
		System.out.println(casuale);
		
		if (casuale < 0.5) {
			System.out.println("La mia risposta è SI!");
		} else {
			System.out.println("La mia risposta è NO!");
		}

	}

}
