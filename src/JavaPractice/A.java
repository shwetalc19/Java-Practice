package JavaPractice;

public class A {

	public void m1() {
		System.out.println("m1");
		m2();
	}

	public void m2() {
		System.out.println("m2");
		m3();
	}

	public void m3() {
		System.out.println("m3");
		p2();
	}
	
	public static void p1() {
		System.out.println("p1");
		p2();
		A pp = new A();
		pp.m3();
	}
	
	public static void p2() {
		System.out.println("p2");
		p3();
		A ppp = new A();
		ppp.m3();
	}
	
	public static void p3() {
		System.out.println("p3public static void main(String[] args) {");
	}

	
		A p1 = new A();

	}




