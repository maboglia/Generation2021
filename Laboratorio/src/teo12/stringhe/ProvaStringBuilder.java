package teo12.stringhe;

/**
 * Questa classe serve per testare il ns stringbuilder
 * @author mauro
 *
 */
public class ProvaStringBuilder {

	/**
	 * 
	 * @param args - passare 0, 1 o più argomenti per far partire questo programma
	 */
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		String[] re = {
				"romolo",
				"numa pompilio",
				"tullo ostilio",
				"anco marzio",
				"servio tullio",
				"tarquinio prisco",
				"tarquinio il superbo"
		};
		
		for (String string : re) {
			sb.append(string).append(" - ");
		}
		
		//System.out.println(sb.toString());
		
		String stringona = sb.toString();
		
		String modificata = stringona.replaceAll(" - ", "|");
		System.out.println(modificata);
		
		//stringona.length()//lunghezza
		//String[] split = stringona.split(" - ");
		//System.out.println(split[0]);
		
	}

}
