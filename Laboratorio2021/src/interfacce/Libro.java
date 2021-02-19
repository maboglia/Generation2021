package interfacce;

public class Libro implements Comparable<Libro> {

	private int pagine;
	private String titolo;

	public Libro(int pagine, String titolo) {
		this.pagine = pagine;
		this.titolo = titolo;
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

	@Override
	public String toString() {
		return "Libro [pagine=" + pagine + ", titolo=" + titolo + "]";
	}

	@Override
	public int compareTo(Libro altroLibro) {
		
		return this.pagine - altroLibro.pagine;
	}
	
	
	
}
