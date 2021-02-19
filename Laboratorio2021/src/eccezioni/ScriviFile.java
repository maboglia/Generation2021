package eccezioni;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScriviFile {

	public static void main(String[] args) {
		

		try {
			FileWriter fw = new FileWriter("documenti/scrittura.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			String[] nani = {"pisolo","mammolo","eolo", 
					"brontolo",	"cucciolo",	"dotto", "gongolo"};
			
			
			for (String nano : nani) {
				pw.println(nano);
			}
			
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
