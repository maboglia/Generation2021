package esercizi;

public class TipiReali {

	public static void main(String[] args) {
		
		//float 32bit
		//double 64bit
		
		double prezzo = 4.70;
		final double IVA = 0.22;
		
		double imposta = prezzo * IVA;
		double totale = prezzo + imposta;
		
		System.out.println("Prezzo imponibile: "  + prezzo  );
		System.out.println("Aliquota IVA 22%: "  + IVA  );
		System.out.println("Totale: " + (prezzo + imposta) );
		

	}

}
