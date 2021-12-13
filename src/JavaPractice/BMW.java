package JavaPractice;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public static void drive()
	{
		System.out.println("BMW----drive");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
}
