package model;

public class Triangolo extends Forma{

	private Punto a, b, c;
	private Segmento ab, ac, bc;

	public Triangolo(Punto a, Punto b, Punto c) {
		this.nomeForma ="triangolo";
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a,b);
		this.bc = new Segmento(b,c);
		this.ac = new Segmento(a,c);
		
	}

//	@Override
//	public String toString() {
//		return "Triangolo [a=" + a + ", b=" + b + ", c=" + c + "]";
//	}
	
	public double perimetro() {
		return ab.lunghezza() + ac.lunghezza() + bc.lunghezza();
	}
	
	public double superficie() {
		
		double d =0;
		
		double sp = this.perimetro()/2;
	
		  d = Math.sqrt(sp * (sp - ab.lunghezza()) * (sp - bc.lunghezza()) * (sp - ac.lunghezza()));
		
		return d;
		
	}

	
	
}
