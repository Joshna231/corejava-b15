package stringHandling;

public class StringTest4 {
	public static void main(String[] args) {
		String s1 = "Teja";
		String s2 = " IT";
		String s3 = s1 + s2;
		System.out.println(s3);

		// String is immutable class - we can't modify the data
		String s4 = "Teja IT";
		String s5 = s4.concat(" Your Java Stop");
		System.out.println(s4);
		System.out.println(s5);
	}
}
