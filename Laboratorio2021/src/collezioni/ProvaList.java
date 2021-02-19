package collezioni;

import java.util.List;//contenitore che ammette duplicati
import java.util.ArrayList;
import java.util.LinkedList;

public class ProvaList {

	public static void main(String[] args) {
		
		List<String> note = new ArrayList<>();
		note.add("do");
		note.add("re");
		note.add("mi");
		note.add("fa");
		note.add("fa");
		
		System.out.println(note.size());
		System.out.println(note.get(3));		
		note.remove(3);
		System.out.println(note.size());
		System.out.println(note.get(3));
		
		
		List<String> note2 = new LinkedList<>();
		note2.add("do");
		note2.add("re");
		note2.add("mi");
		note2.add("fa#");
		note2.add("fa");
		
		System.out.println(note2.size());
		System.out.println(note2.get(3));		
		note2.remove(3);
		System.out.println(note2.size());
		System.out.println(note2.get(3));
	}

}
