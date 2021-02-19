package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiFile {

	public static void main(String[] args) {
		int somma = 0;
		int counter = 0;
		
		File f = new File("documenti/voti.txt");
		
		try {
			Scanner sc = new Scanner(f);
			
			while(sc.hasNext()) {
				counter++;
				somma += Integer.parseInt(sc.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Attenzione: uno dei valori è scorretto");
		}
		double media = (double) somma / counter;
			System.out.println("la media dei voti è: " + media);
	}

}
