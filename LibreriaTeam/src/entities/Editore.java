package entities;

public class Editore {
	
	private String nome;
	private int id;
	
	
	
	public Editore() {}
	/**
	 * @param nome
	 * @param id
	 */
	public Editore(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	@Override
	public String toString() {
		return "Editore [nome=" + nome + ", id=" + id + "]";
	}
	
	
	

}
