package JavaPractice;

public class TestInterface implements Printable, Showable{
	
	public static void main(String[] args) {
		
		TestInterface test = new TestInterface();
		test.show();
		test.print();
		test.showme();
		Showable.mystaticmethod();
	}

	@Override
	public void show() {
		System.out.println("Show");
	}

	@Override
	public void print() {
	System.out.println("Print");	
	}

	
}
