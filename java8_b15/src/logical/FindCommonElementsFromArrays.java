package logical;

public class FindCommonElementsFromArrays {
	public static void main(String[] args) {
		int arr1[] = { 10, 15, 20, 25, 30, 50, 90, 60 };
		int arr2[] = { 80, 70, 35, 10, 60, 20 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}

		}

	}
}
