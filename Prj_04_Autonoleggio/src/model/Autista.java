package model;

public class Autista {

	private String nome, cognome, patente;

	public Autista(String nome, String cognome, String patente) {
		this.nome = nome;
		this.cognome = cognome;
		this.patente = patente;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getPatente() {
		return patente;
	}

	@Override
	public String toString() {
		return "Autista [nome=" + nome + ", cognome=" + cognome + ", patente=" + patente + "]";
	}
	
	
	
}
