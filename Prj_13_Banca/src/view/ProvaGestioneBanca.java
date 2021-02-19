package view;

import java.util.Scanner;

import controller.ClienteCtrl;
import controller.ContoCtrl;
import model.Cliente;
import model.Conto;

public class ProvaGestioneBanca {

	public static void main(String[] args) {
		ClienteCtrl cc = new ClienteCtrl();
		ContoCtrl conti = new ContoCtrl();

		aggiungiCliente(cc);

		stamapAnagrafica(cc);
		
		Cliente c = cc.getAnagraficaClienti().get(0);
		conti.addConto(c);
		stampaConti(conti);
		
		
	}

	private static void stampaConti(ContoCtrl conti) {
		for(Conto c : conti.getConti()) {
			System.out.println(c);
		}
		
	}

	private static void stamapAnagrafica(ClienteCtrl cc) {
		for (Cliente c : cc.getAnagraficaClienti()) {
			System.out.println(c);
		}
		
	}

	private static void aggiungiCliente(ClienteCtrl cc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome nuovo correntista");
		String nome = sc.nextLine();
		cc.addCliente(nome);
	}

	

}
