package view;

import java.util.Scanner;

import controller.BloccoNote;
import model.Nota;

public class GestioneNote {

	public static void main(String[] args) {
		
		BloccoNote notesBianco = new BloccoNote();
		String s = "";
		boolean esci = false;
		
		Scanner sc = new Scanner(System.in);
		
		while (!esci) {
			System.out.println("Cosa vuoi fare?");
			System.out.println("a) aggiungi nota");
			System.out.println("b) completa nota");
			System.out.println("c) elenco note");
			System.out.println("q) esci");

			s = sc.nextLine();
			
			if (s.equals("a")) {
				riempiBlocco(notesBianco);
			}

			if (s.equals("b")) {
//				notesBianco.completaNota(5);	
				eliminaNota(notesBianco);
			}

			if (s.equals("c")) {
				stampaBloccoNote(notesBianco);				
			}
			
			if (s.equals("q")) {
				esci = true;
				System.out.println("arrivederci! Buon appetito :)");
			}
		}
		
		

	
	}

	private static void eliminaNota(BloccoNote notesBianco) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quale nota vuoi completare? inserisci il numero");
		int s = sc.nextInt();
		notesBianco.completaNota(s);
		
	}

	private static void riempiBlocco(BloccoNote notesBianco) {
		//automatizzare
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci voce");
		String s = sc.nextLine();
		notesBianco.addNota(s);
//		notesBianco.addNota("pane");
//		notesBianco.addNota("uova");
//		notesBianco.addNota("burro");
//		notesBianco.addNota("birra");
//		notesBianco.addNota("biscotti");
//		notesBianco.addNota("biscotti");
//		notesBianco.addNota("carote");
//		notesBianco.addNota("patate");
//		notesBianco.addNota("broccoli");
//		notesBianco.addNota("olio");
	}

	private static void stampaBloccoNote(BloccoNote notesBianco) {
		//stampare elenco
		Nota[] note = notesBianco.getLista();
		for (int i = 0; i < note.length; i++) {
			System.out.println("Nota. " + i + " - " + note[i]);
		}
	}

}
