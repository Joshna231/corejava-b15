package collect;

public class TypeCasting {
	public static void main(String[] args) {

	// implicit type casting
		byte b = 123;
		int i = b;

		short s = 12345;
		long l = s;

		float f = 12.54f;
		double d = f;

		byte b1 = 127;
		short s1 = b1;

	// explicit type casting
		long l2 = 500;
		int i2 = (int) l2;

		double d1 = 76.42;
		float f1 = (float) d1;

		long l3 = 6304368169l;
		short s2 = (short) l3;

		Object obj1 = 'A';
		char c = (char) obj1;

		Object obj2 = true;
		boolean bl = (boolean) obj2;

		Object obj = "joshna";
		String str = (String) obj;
	
	}
}
