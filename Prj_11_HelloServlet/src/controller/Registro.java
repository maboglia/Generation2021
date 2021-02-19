package controller;

import java.util.ArrayList;

import model.Studente;

public class Registro {

	private static ArrayList<Studente> studenti = new ArrayList<>();

	public static ArrayList<Studente> getStudenti() {
		
		studenti.add(new Studente("pippo", "p"));
		studenti.add(new Studente("paperino", "p"));
		studenti.add(new Studente("topolino", "t"));
		
		return studenti;
	}
	
	
	
}
