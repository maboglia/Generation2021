package entities;


public class Libro {
	
	private int id;
	private String titolo;
	private double prezzo;
	private double p_iva;
	private int pagine;
	private int editore_id;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getP_iva() {
		return p_iva;
	}

	public void setP_iva(double p_iva) {
		this.p_iva = p_iva;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getEditore_id() {
		return editore_id;
	}

	public void setEditore_id(int editore_id) {
		this.editore_id = editore_id;
	}


	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", p_iva=" + p_iva + ", pagine="
				+ pagine + ", editore_id=" + editore_id + "]";
	}
	

}
