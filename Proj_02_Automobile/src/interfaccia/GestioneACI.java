package interfaccia;

import java.util.Scanner;

import model.Automobile;

public class GestioneACI {

	public static void main(String[] args) {
		
		//contenitore di automobili
		Automobile[] auto = new Automobile[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < auto.length; i++) {
			
			System.out.println("Dati auto nr."  + (i + 1));
			System.out.println("marca");
			String marca = sc.nextLine();
			
			System.out.println("modello");
			String modello = sc.nextLine();
			
			System.out.println("targa");
			String targa = sc.nextLine();
			
			System.out.println("p: per uso privato, c: per uso commerciale");
			String uso = sc.nextLine();
			
			System.out.println("quanti KW");
			double kw = sc.nextDouble();
			sc.nextLine();
			
			auto[i] = new Automobile(marca, modello, targa, uso.equals("p"), kw);
			
			
		}
		
		
//		auto[0] = new Automobile("FIAT", "500", "AA550BB", true, 78);//uso privato
//		auto[1] = new Automobile("Audi", "A8", "BB550CC", true, 150);//uso privato
//		auto[2] = new Automobile("VW", "GOLF", "CC550DD", false, 100);//uso commerciale
//		auto[3] = null;
		
//		for ( int i = 0; i < auto.length ; i++    ) {
//			if (auto[i] != null)
//			System.out.println(   auto[i]    );
//		}

		for (int i = 0; i < auto.length; i++) {
			if (auto[i] != null)
				System.out.println(   auto[i]    );
		}
		
	}

}
