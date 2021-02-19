package teo12.stringhe;

public class ProvaString01 {

	public static void main(String[] args) {
		
		String s1 = "ciao";
		String s2 = " mondo";
		String s4 = s1 + s2;
		
		String s3 = "ciao Mondo";
		if (  s4.equalsIgnoreCase(s3)   )
			System.out.println("sono uguali");
		else
			System.out.println("sono diverse");
		System.out.println(s4);
		
		
		String s5 = new String("prova");
		String s6 = new String("prova");
		
		s5 += " pippo";
		
		if (s5 == s6)
			System.out.println("sono uguali");
		else
			System.out.println("sono diverse");		
		
	}

}
