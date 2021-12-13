package JavaPractice;

public class Browser {
	String name;
	String vendor;

	private Browser() {
		//this.name = name;
	}

	public String getInfo(Browser br) {
		System.out.println(name + " " + vendor);
		return name;
	}

	public static void main(String[] args) {

		Browser b = new Browser();
		b.name = "Chrome";
		b.vendor = "GooG";
		b.getInfo(b);
	}

}
