package logical;
import java.util.ArrayList;
import java.util.Collections;

public class FindEvenOddPrimeNumber {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 8, 7, 10, 15, 16, 19, 6 };

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> prime = new ArrayList<Integer>();

		for (int num : arr) {

			if (num % 2 == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
			if (isprime(num)) {
				prime.add(num);
			}
		}
		Collections.sort(even);
		Collections.sort(odd);
		Collections.sort(prime);

		System.out.println("Even Numbers: " + even);
		System.out.println("Odd Numbers: " + odd);
		System.out.println("Prime Numbers: " + prime);

	}

	public static boolean isprime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}
}