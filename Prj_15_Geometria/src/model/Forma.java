package model;

public abstract class Forma {//non si posssono istanziare oggetti di una classe astratta
	
	protected String nomeForma;
	
	public abstract double superficie();

	@Override
	public String toString() {
		return "Forma [" + this.nomeForma+ " superficie: " + superficie() + "]";
	}
	
	
	
}
