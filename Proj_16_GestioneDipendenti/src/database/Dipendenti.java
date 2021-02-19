package database;

import controller.LibroMatricola;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class Dipendenti {

	public static Dipendente[] elenco = {
			new Dirigente("Clarissa", "Ballocco"),
			new Impiegato("Pippo", "Uno"),
			new Impiegato("Pluto", "Due"),
			new Impiegato("Paperino", "Tre"),
			new Fattorino("Superman", "Fast"),
			new Fattorino("Batman", "Fast"),
			new Fattorino("Captain America", "Fast"),
			new Fattorino("Wonder Woman", "Fast"),	
		};
	

}
