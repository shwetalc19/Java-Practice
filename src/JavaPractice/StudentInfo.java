package JavaPractice;

public class StudentInfo {

	public static void main(String[] args) {

		System.out.println("Trial");
		Student stud1 = new Student();
		stud1.insertRecord(1, "Shweta");
		stud1.displayInfo();
		
		Student stud2 = new Student();
		stud2.insertRecord(2, "Neha");
		stud2.displayInfo();
		
		new Student().insertRecord(3, "Nikhil");
		
	
	}

}
