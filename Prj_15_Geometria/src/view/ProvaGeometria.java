package view;


import java.util.ArrayList;

import model.Forma;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class ProvaGeometria {

	public static void main(String[] args) {
		
		Punto a = new Punto(1,1);
		Punto b = new Punto(5,1);
		Punto c = new Punto(1,4);
		
		Segmento test = new Segmento(new Punto(3,3),new Punto(6,5));
		System.out.println(test.lunghezza());
		
		Segmento ab = new Segmento(a, b);//4
		Segmento bc = new Segmento(b, c);//3
		Segmento ac = new Segmento(a, c);//5
		
		Triangolo t = new Triangolo(a, b, c);
		System.out.println(t.perimetro());
		System.out.println(t.superficie());
		
		Rettangolo r = new Rettangolo(ab, ac);
		System.out.println(r.perimetro());
		System.out.println(r.superficie());
		
		Quadrato q = new Quadrato(ab);
		System.out.println(q.perimetro());//16
		System.out.println(q.superficie());//16
		
		ArrayList<Forma> forme = new ArrayList<>();
		
		forme.add(r);
		forme.add(q);
		forme.add(t);
		
		for (Forma forma : forme) {
			System.out.println(forma);
		}
		
		
	}

}
