package model;

public class Segmento {

	private Punto a, b;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public double lunghezza() {
		//(1,1) e (5,1) --  (5,1) e (1,4) 
		// x2-x1  e y2-y1
		return Math.sqrt( 
				Math.pow(b.getX()-a.getX(), 2) + //16
				Math.pow(b.getY()-a.getY(), 2) //9
				);//5
	}
	
	
	/**
	 * @return the a
	 */
	public Punto getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(Punto a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public Punto getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(Punto b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + "]";
	}
	            
	
	
}
