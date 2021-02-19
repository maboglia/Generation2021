package controller;

import model.Automobile;

public class AutomobileController {

	private Automobile[] auto = {
			new Automobile(),
			new Automobile("fiat", "panda", 1100, 2, 12)
	};

	public Automobile[] getAuto() {
		return auto;
	}
	
	public Automobile getOne(int i) {
		return auto[i];
	}
	
	public Automobile getAutoByTarga(String targa) {
		for (Automobile automobile : auto) {
			if (automobile.getModello().equals(targa))
				return automobile;
		}
		return null;
	}
}
