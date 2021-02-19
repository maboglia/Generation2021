package model;

public abstract class Dipendente implements Comparable<Dipendente> {
	
	protected String nome;
	protected String cognome;
	protected int nMatricola;
	private static int contatoreMat = 1;
	protected double pagaBase;
	
	
	public Dipendente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.nMatricola = contatoreMat++;
	}

//le classi che estendono Dipendente lo devono implementare  e definire obbligatoriamente
	public abstract double calcolaStipendio(int giorni);

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getnMatricola() {
		return nMatricola;
	}

	@Override
	public String toString() {
		return "{" + nome + ", cognome=" + cognome + ", nMatricola=" + nMatricola + "}";
	}

	@Override
	public int compareTo(Dipendente altroDipendente) {
		// TODO Auto-generated method stub
		return this.cognome.compareTo(altroDipendente.cognome);
	}
	
	
	
}
