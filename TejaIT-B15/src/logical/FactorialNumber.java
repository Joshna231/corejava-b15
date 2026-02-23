package logical;

public class FactorialNumber {

	public static void main(String[] args) {
		// 5*4*3*2*1 = 120
		int n = 5;

		int fact = 1;
		for (int i = 1; i <= 5; i++) { // 5*4*3*2*1 - int i=n; i>=1; i--
										// 1*2*3*4*5 - int i=1; i<=5; i++
			fact = fact * i;
		}

		System.out.println(fact);

	}
}