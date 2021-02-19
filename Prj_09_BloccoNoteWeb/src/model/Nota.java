package model;

public class Nota {

	//incapsulamento
	private boolean completa;
	private String descrizione;
	
	//costruttore metodo senza tipo ritorno, normalmente public, scompare quello di default
	public Nota(String descrizione) {
		this.descrizione = descrizione;
		this.completa = false;
		//System.out.println("ho creato la nota: " + this.descrizione);
	}

	public boolean isCompleta() {
		return completa;//     true/false
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}

	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public String toString() {
		String s = "[ ]";//non completa
		
		if (this.completa) {
			s = "[*]";
		}
		
		return s + " " + descrizione + "";
		//[ ] latte
		//[*] pane
	}
	
	
	
	
}
