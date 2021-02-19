package model;

public class Fattorino extends Dipendente{
	
	private int consegne;
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		this.consegne = 0;
		this.pagaBase = ParametriCosto.TARIFFA_FATTORINO;
	}

	@Override
	public double calcolaStipendio(int giorni) {
		return (this.consegne * ParametriCosto.TARIFFA_CONSEGNA) + 
				(pagaBase * ParametriCosto.GIORNATA * giorni);
		
	}

	public void setConsegne(int consegne) {
		this.consegne = consegne;
	}

		

}
