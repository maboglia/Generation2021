package model;

public class Libro {

	//dati, proprietà, attributi, fields
	//stato interno dell'oggetto
	
	private int pagine;
	private String titolo;
	private String autore;
	
	
	//metodi - overload 
	public Libro() {
		this.pagine = 0;
		this.titolo = "";
		this.autore = "";
	}

	/**
	 * 
	 * @param titolo - Inserire come primo argomento una stringa rappresentante il titolo
	 * @param autore
	 */
	public Libro(String autore, String titolo) {
		this.titolo = titolo;
		this.autore = autore;
		this.pagine = 0;
	}

	/**
	 * @return the pagine
	 */
	public int getPagine() {
		return pagine;
	}

	/**
	 * @param pagine the pagine to set
	 */
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the autore
	 */
	public String getAutore() {
		return autore;
	}

	/**
	 * @param autore the autore to set
	 */
	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "Libro [pagine=" + pagine + ", titolo=" + titolo + ", autore=" + autore + "]";
	}
	
	//metodi accessori (getters) mutatori (setters)
	
	
	
}
