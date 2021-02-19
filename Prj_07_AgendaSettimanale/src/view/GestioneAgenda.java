package view;

import java.util.Scanner;

import controller.AgendaSettimanale;
import model.Giorno;
import model.Impegno;
import model.Settimana;

public class GestioneAgenda {

	public static void main(String[] args) {
		Settimana s1 = new Settimana("prima");
		
		AgendaSettimanale as = new AgendaSettimanale(s1);
		//AgendaSettimanale as = new AgendaSettimanale(new Settimana("prima"));

		addImpegno(as);

		vistaSettimanale(as);
		
		
		
//		for (Impegno i : lun.getImpegni()) {
//			System.out.println(i);
//		}
//		
		
		
		
		
	}

	private static void addImpegno(AgendaSettimanale as) {
		//uso uno scanner
		Scanner sc = new Scanner(System.in);
		
		//chiedo il giorno dell'impegno
		System.out.println("che giorno?(0 per lu - 6 per do)");
		int giorno = sc.nextInt();
		sc.nextLine();
		//chiedo l'ora
		System.out.println("a che ora?");
		int ora = sc.nextInt();
		sc.nextLine();
		//chiedo l'impegno
		System.out.println("quale impegno?");
		String impegno = sc.nextLine();
		
		//mi faccio tornare il giorno giusto per l'impegno
		Giorno giornoImpegno = as.getGiorno(giorno);
		
		//da agendaSettimanale mi faccio ritornare l'impegno e lo sostituisco con la stringa dell'utente
		as.getImpegno(giornoImpegno, ora).setImpegno(impegno);
	}

	private static void vistaSettimanale(AgendaSettimanale as) {
		Giorno lun = as.getGiorno(0);
		Giorno mar = as.getGiorno(1);
		Giorno mer = as.getGiorno(2);
		Giorno gio = as.getGiorno(3);
		Giorno ven = as.getGiorno(4);
		Giorno sab = as.getGiorno(5);
		Giorno dom = as.getGiorno(6);

		int ore = 10;
		
		lun.getImpegni()[4].setImpegno("Esame Java");
		
		as.getImpegno(lun, 9).setImpegno("HTML");
		
		for (int i = 0; i < ore; i++) {
			System.out.print(lun.getImpegni()[i]);
			System.out.print(mar.getImpegni()[i]);
			System.out.print(mer.getImpegni()[i]);
			System.out.print(gio.getImpegni()[i]);
			System.out.print(ven.getImpegni()[i]);
			System.out.print(sab.getImpegni()[i]);			
			System.out.print(dom.getImpegni()[i]);			

			System.out.println();			
		}
	}

}
