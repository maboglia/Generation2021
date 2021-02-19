package enumerazioni;

public enum Taglia {
	S(40), M(44), L(48), XL(52);
	
	private int taglia;

	private Taglia(int taglia) {
		this.taglia = taglia;
	}

	/**
	 * @return the taglia
	 */
	public String getTaglia() {
		return "la taglia " + this + " " + taglia;
	}
	
	
}
