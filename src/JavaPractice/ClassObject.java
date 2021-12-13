package JavaPractice;

public class ClassObject 
{
	int i=20;     //class variable/global variable  //can be used in the entire class
	
	public static void main(String[] args) 
	{
		int i=10;	//local variable : in a method - scope only in the method
		System.out.println(i); //10
		
		ClassObject obj = new ClassObject();  //if you want to access class variable create instance of class
		System.out.println(obj.i);  //20
	}
}
