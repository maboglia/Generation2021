package controller;

import java.util.ArrayList;

import model.Dipendente;

public class LibroMatricola {
	
	private ArrayList<Dipendente> dipendenti;

	public LibroMatricola() {
		this.dipendenti = new ArrayList<>();
	}
	
	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}

	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
}
