package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	//costruttore non si eredita 
	public Quadrato(Segmento lato) {
		super(lato, lato);//per costruire un oggetto di tipo rett
		this.nomeForma ="quadrato";
		this.lato = lato;
	}

	@Override
	public double superficie() {
		System.out.println("Calcolo la superificie con la formula del quadrato");
		return Math.pow(this.lato.lunghezza(), 2);
	}
	
}
