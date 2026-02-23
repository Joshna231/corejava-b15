package loops;

public class ArrayTest {
	public static void main(String[] args) {

		// to store the multiple values of same type

		// int - data type
		// arr - reference variable
		// [] - array operator or symbol
		// new - keyword
		// [4] - length of array
		int arr[] = new int[4]; // array object
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		// arr[4]=50; // it cannot access because the length value is 4
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		// System.out.println(arr[4]);

	}
}