package model;

public class Automobile {

	private String marca, modello;
	private int cilindrata,	ruoteMotrici, consumo;

	public Automobile(String marca, String modello, int cilindrata, int ruoteMotrici, int consumo) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.ruoteMotrici = ruoteMotrici;
		this.consumo = consumo;
	}
	
	public Automobile() {
		this.marca = "Generica";
		this.modello = "Generale";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getRuoteMotrici() {
		return ruoteMotrici;
	}

	public void setRuoteMotrici(int ruoteMotrici) {
		this.ruoteMotrici = ruoteMotrici;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + "]";
	}
	
	
	
}
