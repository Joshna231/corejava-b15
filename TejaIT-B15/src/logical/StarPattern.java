package logical;

public class StarPattern {

	// Method to print the pattern

	public void pattern() {
		// Increasing stars
		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= i; j++) { // stars
				System.out.print("*");
			}
			System.out.println(); // new line
		}
	}

	public static void main(String[] args) {

		StarPattern fn1 = new StarPattern();
		fn1.pattern();

	}
}