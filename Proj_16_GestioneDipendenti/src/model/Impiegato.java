package model;

public class Impiegato extends Dipendente {

	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		this.pagaBase = ParametriCosto.TARIFFA_IMPIEGATO;
	}

	@Override
	public double calcolaStipendio(int giorni) {
		return this.pagaBase * ParametriCosto.GIORNATA *giorni; //8 sono le ore lavorate al giorno
	}

	

}
