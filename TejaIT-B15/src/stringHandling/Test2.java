package stringHandling;

public class Test2 {

	public void m1(String str) {
		System.out.println("String..." + str);
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer..." + sb);
	}

	public void m1(StringBuilder sbu) {
		System.out.println("StringBuilder.." + sbu);
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		// t2.m1(null); // ambiguity error will come...

		String s = new String("String value");
		t2.m1(s);

		StringBuffer sb = new StringBuffer("String Buffer value");
		t2.m1(sb);

		StringBuilder sbu = new StringBuilder("String Builder value");
		t2.m1(sbu);
	}
}
