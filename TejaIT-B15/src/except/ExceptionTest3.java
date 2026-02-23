package except;

public class ExceptionTest3 {

	public int m1() {

		try {
			int i = 10;
			int j = 2;
			int k = i / j;
			System.out.println("k value::" + k);
			return 10;

		} catch (Exception e) {
			e.printStackTrace();
			return 20;

		} finally { // must and should be finally block will always execute
			return 30;
		}
	}

	public static void main(String[] args) {
		ExceptionTest3 et3 = new ExceptionTest3();
		System.out.println("return value::" + et3.m1());
	}
}