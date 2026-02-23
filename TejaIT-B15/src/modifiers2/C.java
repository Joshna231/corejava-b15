package modifiers2;

public class C {

	int id = 5;

	public void cm1() {
		System.out.println("C class cm1 method");
	}

	public static void main(String[] args) {
		C c = new C();
		c.cm1();
	}
}