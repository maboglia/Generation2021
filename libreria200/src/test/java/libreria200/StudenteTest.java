package libreria200;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import libreria200.model.Studente;

public class StudenteTest {

	@Test
	public void creaStudente() {
		Studente s = new Studente();
		s.setNome("mauro");
		
		assertTrue(s.getNome().startsWith("m"));
	}
	
}
