package methods;

public class Methods3 {

	public void m1(int id) { // parameterized methodsF
		System.out.println("one parameter...int value::" + id);
	}

	public void m2(String name) {
		System.out.println("one parameter..String value::" + name);
	}

	public void m3(int i, String s) {
		System.out.println("two parameters.." + i + "  " + s);
	}

	public void m4(char c, boolean bool, String name) {
		System.out.println("three parameters.." + c + "  " + bool + "  " + name);
	}

	public void m5(String name, char c, long l, double d, float f) {
		System.out.println("five parameters.." + name + " " + c + " " + l + " " + d + " " + f);
	}

	public static void main(String[] args) {
		Methods3 m3 = new Methods3();
		m3.m1(20);
		m3.m2("joshna");
		m3.m3(11, "adam");
		m3.m4('B', true, "kumari");
		m3.m5("josh", 'A', 12234l, 12.34, 23.53f);

	}
}