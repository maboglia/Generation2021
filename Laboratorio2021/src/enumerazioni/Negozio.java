package enumerazioni;

public class Negozio {

	public static void main(String[] args) {
		TShirt t1 = new TShirt(Colore.BLUE, Taglia.L);
		TShirt t2 = new TShirt(Colore.RED, Taglia.M);

		System.out.println(t1 +": "+  t1.taglia.getTaglia());
		System.out.println(t2);
		
	}

}
