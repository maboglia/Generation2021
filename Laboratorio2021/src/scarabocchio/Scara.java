package scarabocchio;

public class Scara implements Cloneable{

	int i = 0;
	public static enum MyEnum { 
		ENUM1 { public void metodo1() { } }, 
		ENUM2 { public void metodo2() { } };

		void metodo1() {
			// TODO Auto-generated method stub
			
		} 
	}
	
	
	public static void main(String[] args) {
		
		StringBuilder  a = new StringBuilder("prova");
		StringBuilder b = a;
		
		b.append("peppino");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		
		Integer[] test = new Integer[10];
		
		test[4] = 3;
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		
		for (Integer integer : test) {
			System.out.println(integer);
		}
		
		
		//i = 5;
		Scara s = new Scara();
		
		s.i = 5;
		
		try {
			Scara c = (Scara) s.clone();
			c.i=7;
			System.out.println(c.i);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scara.metodoStatico();
		
		System.out.println(s.i);
		
	}

	public void metodoNonStatico() {
		System.out.println("TEST");
	}

	public static void metodoStatico() {
		System.out.println("TEST");
	}
	
	
}
