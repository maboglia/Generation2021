package model;

/**
 * Classe che fa da modello per il generico cliente
 * @author mauro
 *
 */
public class Cliente {
	/**
	 * proprietà, attributo, field: contiene il nuome del cliente
	 */
	private String nome;

	/**
	 * Metodo costruttore dell'oggetto di tipo Cliente
	 * @param nome - inserire nome cliente
	 */
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}


	
	
	
	
	
}
