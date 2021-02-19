package entities;

public class Catalogo {
	private Libro libro;
	private Autore autore;
	private Editore editore;
	
	
	/**
	 * @param libro
	 * @param autore
	 * @param editore
	 */
	public Catalogo(Libro libro, Autore autore, Editore editore) {
		super();
		this.libro = libro;
		this.autore = autore;
		this.editore = editore;
	}
	/**
	 * @param libro
	 * @param autore
	 * @param editore
	 */
	public Catalogo() {
		super();
		this.libro = null;
		this.autore = null;
		this.editore = null;
	}
	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}
	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	/**
	 * @return the autore
	 */
	public Autore getAutore() {
		return autore;
	}
	/**
	 * @param autore the autore to set
	 */
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	/**
	 * @return the editore
	 */
	public Editore getEditore() {
		return editore;
	}
	/**
	 * @param editore the editore to set
	 */
	public void setEditore(Editore editore) {
		this.editore = editore;
	}
	@Override
	public String toString() {
		return "[Titolo=" + libro.getTitolo() + ", editore=" + editore.getNome() 
		+ ", autore=" + autore.getNome() + ", prezzo=" + libro.getPrezzo() + "]";
	}
	
	/*titolo
	editore
	autore
	prezzo*/
	
}
