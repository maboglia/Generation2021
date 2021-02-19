package model;

import java.util.Date;

public class Noleggio {

	private Date dataNoleggio;
	private Autista autista;
	private Automobile auto;
	private int giorni;

	public Noleggio(Autista autista, Automobile auto, int giorni) {
		this.autista = autista;
		this.auto = auto;
		this.giorni = giorni;
		this.dataNoleggio = new Date();
	}

	@Override
	public String toString() {
		return "Noleggio [dataNoleggio=" + dataNoleggio + ", autista=" + autista + ", auto=" + auto + ", giorni="
				+ giorni + "]";
	}

}
