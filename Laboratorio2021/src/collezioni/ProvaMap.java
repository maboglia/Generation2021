package collezioni;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProvaMap {

	public static void main(String[] args) {
		//la chiave funziona come un Set, il valore come una List
		Map<String, String> capoluoghi = new HashMap<String, String>();
		
		capoluoghi.put("Piemonte", "Torino");
		capoluoghi.put("Lombardia", "Milano");
		capoluoghi.put("Lazio", "Torino");
		capoluoghi.put("Piemonte", "Cuneo");

		System.out.println(capoluoghi.size());
		
		Set<String> keySet = capoluoghi.keySet();
		Collection<String> values = capoluoghi.values();
		//Collections.sort((List<String>)values);
		
		for (String regione : keySet) {
			System.out.println(capoluoghi.get(regione));
		}
		
	}
	
}
