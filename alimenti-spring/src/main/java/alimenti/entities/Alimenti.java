package alimenti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alimenti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String categoria;
	private String prodotto;
	private double proteine;
	private double lipidi;
	private double carboidrati;
	private int energia;
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
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the prodotto
	 */
	public String getProdotto() {
		return prodotto;
	}
	/**
	 * @param prodotto the prodotto to set
	 */
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	/**
	 * @return the proteine
	 */
	public double getProteine() {
		return proteine;
	}
	/**
	 * @param proteine the proteine to set
	 */
	public void setProteine(double proteine) {
		this.proteine = proteine;
	}
	/**
	 * @return the lipidi
	 */
	public double getLipidi() {
		return lipidi;
	}
	/**
	 * @param lipidi the lipidi to set
	 */
	public void setLipidi(double lipidi) {
		this.lipidi = lipidi;
	}
	/**
	 * @return the carboidrati
	 */
	public double getCarboidrati() {
		return carboidrati;
	}
	/**
	 * @param carboidrati the carboidrati to set
	 */
	public void setCarboidrati(double carboidrati) {
		this.carboidrati = carboidrati;
	}
	/**
	 * @return the energia
	 */
	public int getEnergia() {
		return energia;
	}
	/**
	 * @param energia the energia to set
	 */
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	@Override
	public String toString() {
		return "Alimenti [id=" + id + ", categoria=" + categoria + ", prodotto=" + prodotto + ", proteine=" + proteine
				+ ", lipidi=" + lipidi + ", carboidrati=" + carboidrati + ", energia=" + energia + "]";
	}
	
	
	
	
}
