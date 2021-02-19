package teo11.array;

import java.util.Arrays;

public class Stringhe {

	public static void main(String[] args) {
		
		
		
		//inizializzo
//		nani = new String[7];
		
		//inserisco i valori(riferimenti agli oggetti)
//		nani[0] = "pisolo";//string inizializzato con apici
//		nani[1] = new String("mammolo");//string inizializzata con operatore new
	
		//inizializzo shorthand scorciatoia
		//dichiaro array di stringhe
		String[] nani = {"pisolo","mammolo","eolo", 
				"brontolo",	"cucciolo",	"dotto", "gongolo"};
		
		for (int i = 0; i < nani.length; i++) {
			System.out.println(nani[i]);
		}
		//ordino l'array col metodo statico .sort() della classe java.util.Arrays
		Arrays.sort(nani);
		//dichiaro una string inizializzata a null (è un oggetto nullo)
		String nanoCorrente = null;
		
		System.out.println("nani ordinati");
		for (int i = 0; i < nani.length; i++) {
			//assegno alla var il valore della string corrente
			nanoCorrente = nani[i];
			
			System.out.println("------------------------------------");
			System.out.println(nanoCorrente);
			System.out.println("------------------------------------");
			System.out.println(nanoCorrente.charAt(0));
			System.out.println(nanoCorrente.equals("pisolo"));
			System.out.println(nanoCorrente.toUpperCase());
			System.out.println(nanoCorrente.substring(2));
			if(nanoCorrente.length() <= 3)
				System.out.println(nanoCorrente.substring(2, 5));
			System.out.println(nanoCorrente.startsWith("b"));
			System.out.println(nanoCorrente.endsWith("lo"));
			System.out.println(nanoCorrente.contains("ol"));
			System.out.println(nanoCorrente.repeat(3));
			System.out.println(nanoCorrente.replaceAll("o", "@"));
			System.out.println("------------------------------------");



		}
		
	}

}
