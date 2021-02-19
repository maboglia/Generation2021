package view;

import java.util.ArrayList;
import java.util.Collections;

import controller.LibroMatricola;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente[] dip = {
			new Dirigente("Clarissa", "Ballocco"),
			new Impiegato("Pippo", "Uno"),
			new Impiegato("Pluto", "Due"),
			new Impiegato("Paperino", "Tre"),
			new Fattorino("Superman", "Fast"),
			new Fattorino("Batman", "Fast"),
			new Fattorino("Captain America", "Fast"),
			new Fattorino("Wonder Woman", "Fast"),	
		};
		
		LibroMatricola lm = new LibroMatricola();
		for (Dipendente dipendente : dip) {
			lm.addDipendente(dipendente);
		}
		
		double varStipendio = 0;
		int giorni = 22;
		int consegne = 2;
		
		ArrayList<Dipendente> dipendenti = lm.getDipendenti();
		
		Collections.sort(dipendenti);
		
		for (Dipendente d : dipendenti) {
			if (d instanceof  Fattorino) {
				((Fattorino)d).setConsegne(consegne);
			}
			varStipendio += d.calcolaStipendio(giorni);
			System.out.print(d.getNome() +" "+d.getCognome() + ": ");
			System.out.println(d.calcolaStipendio(giorni));
		}
		
		System.out.println("Stipendio totale = " + varStipendio);

	}

}
