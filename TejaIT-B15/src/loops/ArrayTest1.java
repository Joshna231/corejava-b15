package loops;

public class ArrayTest1 {
	public static void main(String[] args) {
		String[] birlaproducts = { "idea", "pantaloons", "vi", "docomo", "birla soft", "birla white", "ultra tech" };

		System.out.println(birlaproducts[0]);
		System.out.println(birlaproducts[1]);
		System.out.println(birlaproducts[2]);
		System.out.println(birlaproducts[3]);
		System.out.println(birlaproducts[4]);
		System.out.println(birlaproducts[5]);
		// System.out.println(birlaproducts[6]);
		System.out.println("===================================================");

		for (int i = 0; i < 6; i++) {
			System.out.println(birlaproducts[i]);
		}

		System.out.println("===================================================");

		for (int i = 0; i < birlaproducts.length; i++) {
			System.out.println(birlaproducts[i]);
		}
	}
}