package model;

public class Studente {

	//contatore static: appartiene alla classe e serve per contare gli studenti costruiti
	private static int contatore = 1;
	private String nome, cognome;
	private int nMatricola;

	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		//ogni volta che istanzio uno studente:
		//col valore di contatore attribusco il valore alla matricola dello studente corrente (this)
		//poi, il valore di contatore si incrementa di uno 
		this.nMatricola = Studente.contatore++;
	}

	public String getCognome() {
		return cognome;
	}
	
	@Override
	public String toString() {
	
		return nMatricola + ") " + nome + ", " + cognome;

	}
	
	
	
	
}
