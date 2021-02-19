package controller;

import model.Autista;
import model.Automobile;
import model.Noleggio;

public class NoleggioController {

	private Noleggio[] noleggi = new Noleggio[100];
	private static int nNoleggi = 0;
	
	
	
	public Noleggio[] getNoleggi() {
		return noleggi;
	}
	
	public void noleggia(Autista a, Automobile auto, int giorni) {
		
		noleggi[nNoleggi] = new Noleggio(a, auto, giorni);
		nNoleggi++;
	}
	
	
}
