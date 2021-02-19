package controller;

import model.Giorno;
import model.Impegno;
import model.Settimana;

public class AgendaSettimanale {

	private Settimana settimana;

	public AgendaSettimanale(Settimana settimana) {
		this.settimana = settimana;
	}

	public Settimana getSettimana() {
		return settimana;
	}
	
	public Giorno getGiorno(int i) {
		
		return this.settimana.getGiorni()[i];
	}
	
	public Impegno getImpegno(Giorno g, int ora) {
		return g.getImpegni()[ora-8];
	}
	//overload
	public Impegno getImpegno(int g, int ora) {
		return this.settimana.getGiorni()[g].getImpegni()[ora-8];
	}
	
	
}
