package teo11.array;

public class Interi {

	public static void main(String[] args) {
		
		//dichiarazione di un array di interi
		int[] voti;

		//inizializzato un oggetto di tipo array (contenitore indicizzato)
		voti = new int[10];
		
		//nell'array length è una proprietà dell'oggetto
		int lunghezza = voti.length;
		int somma = 0;
//		System.out.println(lunghezza);
		
//		voti[0] = 5;
//		voti[1] = 1;
//		//...
		//ciclo per riempire l'array voti con 10 valori casuali tra 1 e 10
		for (int i = 0; i < voti.length; i++) {
			
			voti[i] = (int) (Math.random() * lunghezza) + 1;
		}
		
		//ciclo per leggere i valori contenuti nell'array voti
		for (int i = 0; i < voti.length; i++) {
			System.out.println("Il voto alla posizione " + i + " è: " + voti[i]);
			somma += voti[i];
		}
		System.out.println("La somma dei voti casuali è: " + somma);
		System.out.println("La media dei voti è: " + ((double) somma/lunghezza));
		
	}

}
