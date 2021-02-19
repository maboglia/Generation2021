package model;

public class Libro {

	private String titolo;
	private String codice;
	private double prezzo;
	
	public Libro(String titolo, String codice, double prezzo) {
		this.titolo = titolo;
		this.codice = codice;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", codice=" + codice + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
