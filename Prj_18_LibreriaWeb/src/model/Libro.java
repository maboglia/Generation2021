package model;

public class Libro {
	
	private int id;
	private String titolo ;
	private double prezzo;
//	private double p_iva;
	private int pagine;
	private int editore_id;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}
	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
//	/**
//	 * @return the p_iva
//	 */
//	public double getP_iva() {
//		return p_iva;
//	}
//	/**
//	 * @param p_iva the p_iva to set
//	 */
//	public void setP_iva(double p_iva) {
//		this.p_iva = p_iva;
//	}
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
	 * @return the editore_id
	 */
	public int getEditore_id() {
		return editore_id;
	}
	/**
	 * @param editore_id the editore_id to set
	 */
	public void setEditore_id(int editore_id) {
		this.editore_id = editore_id;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine + ", editore_id="
				+ editore_id + "]";
	}

	
}
