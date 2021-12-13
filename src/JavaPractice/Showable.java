package JavaPractice;

public interface Showable {

		void show();
		
		default void showme() {
			System.out.println("Default method");
		}
		static void mystaticmethod() {
			System.out.println("Static methd");
		}
}
