package JavaPractice;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	BMW b = new BMW();
		b.start();//overridden 
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.theftSafety();
		a.sportsMode(); */

		//child class object can be referred by parent class ref variable:
		//top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		c1.start();
		
		
		//child class object can be referred by grant parent class ref variable:
		Vehicle v1 = new BMW();
		v1.engine();
		v1.start();//BMW 
		BMW.drive();
		Car.drive();
		Vehicle.drive();
	}

}
