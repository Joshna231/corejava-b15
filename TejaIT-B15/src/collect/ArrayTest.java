package collect;

public class ArrayTest {
	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("=============================================");

		for (int val : arr) {
			System.out.println(val);
		}
	}
}
