package modelli;

public class ProvaBicicletta {

		
	public static void main(String[] args) {
		Bicicletta bici1 = new Bicicletta("Atala");		
		bici1.accelera(20); 
		bici1.cambia(2);
		
		System.out.println(bici1.stampaReport());
		bici1.cambia(4);
		System.out.println(bici1.stampaReport());

		Bicicletta bici2 = new Bicicletta("Specialized");
		bici2.accelera(20); 
		bici2.cambia(5);
		System.out.println(bici2.stampaReport());
		
		
		
	}

}
