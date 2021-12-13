package JavaPractice;

public class Student{
	int rollno;
	String name;
	
	public void insertRecord(int rollno, String name) {
		this.rollno = rollno;
		this.name=name;
	}
	
	public void displayInfo() {
		System.out.println("roll no: "+ rollno +" name: " + name);
	}
	

}
