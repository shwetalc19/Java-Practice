package JavaPractice;

import java.util.ArrayList;

public class Employee {
	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;
	ArrayList<String> ar;
	public void test()
	{
		int i =10; //local variable
		System.out.println(i);
		return;
	} 
	public int add1(int a , int b)    //local variable
	{
        int c = a+ b;	 //local variable
		return c;
	}
	public int add(int a , int b)    //method parameters ; local variable, you cannot have one more int  a inside this function.
	{
		if(a!=0 && b!=0)
		{
			int c = a+ b;	 //local variable
			return c;
		}
		return -1;
	}

	public void getBalance()
	{
		int i =10; //local variable
		System.out.println(i);
		return;
	}
	public static void main(String[] a1, int a ) {
		System.out.println("main2");
	}
	public static void main(String[] a) {
	
		Employee e1 = new Employee();
		Employee e2= new Employee();
		e1.name = "A";  e2.name ="B";
	//	System.out.println(e1);
	//	System.out.println(e2);
		e1.test();	
	}


}

