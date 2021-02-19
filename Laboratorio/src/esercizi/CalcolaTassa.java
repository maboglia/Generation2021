package esercizi;

import java.util.Scanner;

/*
 * Scrivere una funzione (metodo) per calcolare l’importo di una tassa secondo la seguente tabella:
* Fino a 10.000 €, l’importo della tassa è del 10%
* Fino a 20.000 €, l’importo della tassa è del 10% per i primi 10.000 €, del 7 % sul restante.
* Fino a 30.000 €, l’importo è ancora del 10% per i primi 10.000 €, poi del 7% fino a 20.000 ed infine il 5% sul restante.
* Oltre i 30.000 € ci si comporta come prima, aggiungendo un ulteriore 3% sulla porzione oltre i 30.000 €.
* Per ogni importo non valido si ritorni -1 (qualunque importo che non sia un numero reale e positivo).

* Esempi:Un importo di 10000, dovrebbe tornare 1000 (1 è il 10% di 10)
* Un importo di 21000, dovrebbe tornare 1750 (10% di 10 + 7% di 10 + 5% di 1)
 */

public class CalcolaTassa {

	static final double TAX10 = 0.1;//Fino a 10.000 €, l’importo della tassa è del 10%
	static final double TAX20 = 0.07;//da 10 a 20K del 7 % sul restante.
	static final double TAX30 = 0.05;//da 20 a 30K del 5%
	static final double TAX_OVER = 0.03;//oltre 30K del 3%
	static final double SCAGLIONE = 10000;
	
	public static void main(String[] args) {
		
		double importo = getInput();
		double tassa = 0;
		
		tassa = calcolaTasse(importo, tassa);
		
		System.out.println(calcolaTasse(5));
		
		System.out.println("Dato l'importo imponibile di € " + importo);
		if (tassa >= 0)
		System.out.println("Le tasse da pagare sono di € " + tassa);
		if(tassa < 0) {
			System.out.println("Sei andato sotto! Non ci sono tasse da pagare. Buona fortuna per l'anno prossimo!");
		}
		
	}
	
	
	private static double calcolaTasse(double importo) {
		
		if (importo <= 1) {
			return 1;
		} else {
			return (importo * calcolaTasse(importo - 1));
		}
		
		
		//double tassa=0;
		
		//21000 ciclo (x 21 - (10 * t1)), (11 - (10*t2) ), (1 - (1*t3)) , (x  10)esci
		
		
		//return tassa;
		
	}
	

	private static double calcolaTasse(double importo, double tassa) {
		if (importo <= 0) {
			//return -1
			//da pagare 0 - zero
			tassa = -1;
		} else if (importo <= SCAGLIONE ) {
			tassa = importo * TAX10;
		} else if (importo <= 2 * SCAGLIONE ) {
			tassa = SCAGLIONE * TAX10 + (importo - SCAGLIONE) * TAX20;
		} else if (importo <= 3 * SCAGLIONE ) {
			tassa = (SCAGLIONE * TAX10) + (SCAGLIONE * TAX20) + (importo - 2 * SCAGLIONE ) * TAX30;
		} else {
			tassa = (SCAGLIONE * TAX10) + (SCAGLIONE * TAX20) + (SCAGLIONE * TAX30) + (importo - 3 * SCAGLIONE ) * TAX_OVER;
		}
		return tassa;
	}

	private static double getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci importo imponibile (maggiore di 0)");
		return sc.nextDouble();
	}
	
}
