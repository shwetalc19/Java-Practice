package JavaPractice;

public class Car extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}

	public static void drive()
	{
		System.out.println("Car----drive");
	}
	
	
	/*String name;
	int price;
	String color;
	static int wheels = 4;
	public void getInfo() 
	{
		System.out.println("get info....");
	}
	
	public static void sendMail() 
	{
		System.out.println("send mail....");
	}
	
	//static class vars should be the common value
	public static void main(String[] args) 
   {
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "Blue";

		Car c2 = new Car();
		c2.name = "AUdi";
		c2.price = 70;
		c2.color = "White";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 15;
		c3.color = "Black";
		
		System.out.println(c1.name + " :" + c1.price + " : "+ c1.color );
		
		//how to access static vars & methods :  no need to create the object
		//1. within the same class, you can access them directly
		System.out.println(wheels); 	//variable
		sendMail();  					//static method
		c1.getInfo();  					//non static method

		//2. you can call by the class name:   best practice
		System.out.println(Car.wheels);	//variable
		Car.sendMail(); 				//static method
		
	//3. call by object ref:  java throws a warning – static field should be accessed in static way
		System.out.println(c1.wheels);   //variable
		c1.sendMail(); 					 //static method
	}

*/

}
