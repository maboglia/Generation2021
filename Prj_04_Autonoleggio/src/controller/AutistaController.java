package controller;

import model.Autista;

public class AutistaController {

	private Autista[] autisti = {
			new Autista("paolino", "paperino", "PAP12"),
			new Autista("pippo", "pippi", "PIP36"),
			new Autista("pluto", "pluti", "PLU45"),
	};

	public Autista[] getAutisti() {
		return autisti;
	}
 	
	public Autista getAutista(String nome) {
		for (Autista autista : autisti) {
			if (autista.getNome().equals(nome))
				return autista;
		}
		return null;
	}
	
	
}
