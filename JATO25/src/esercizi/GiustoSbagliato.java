package esercizi;

public class GiustoSbagliato {

	public static void main(String[] args) {
	
		int usciteSI = 0;
		int usciteNO = 0;
		double casuale = 0.0;
		final int RIPETIZIONI = 10;
		
		//creo un ciclo 
		
		for ( int i = 0; i < RIPETIZIONI ; i++    ) {//inizio
			casuale = Math.random();
			
			if (casuale < 0.5) {
				usciteSI++;
			} else {
				usciteNO++;
			}
		}//fine ciclo
		
		System.out.println("SI: " +usciteSI);
		System.out.println("NO: " +usciteNO);
		
	}

}
