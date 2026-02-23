package loops;

public class DoWhileTest {
	public static void main(String[] args) {
// even the condition fails, it will execute at least once

		int i = 0; // initialization
		do {
			System.out.println(i); // execution
			i++; // increment/decrement
		} while (i > 10); // condition
	}

}
