package methods;

public class Methods1 {
	public byte id() {
		return 123;
	}

	public short num() {
		return 1234;
	}

	public int value() {
		return 12343;
	}

	public long mobile() {
		return 12345627l;
	}

	public double amt() {
		return 12.34;
	}

	public float miles() {
		return 12.234f;
	}

	public char grade() {
		return 'B';
	}

	public boolean areyoucrying() {
		return true;
	}

	public static void main(String[] args) {
		Methods1 m1 = new Methods1();
		byte val = m1.id();
		System.out.println(val);

		short val1 = m1.num();
		System.out.println(val1);

		int val2 = m1.value();
		System.out.println(val2);

		long val3 = m1.mobile();
		System.out.println(val3);

		double val4 = m1.amt();
		System.out.println(val4);

		float val5 = m1.miles();
		System.out.println(val5);

		char val6 = m1.grade();
		System.out.println(val6);

		boolean val7 = m1.areyoucrying();
		System.out.println(val7);
	}
}