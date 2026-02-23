package except;

public class ExceptionTest2 {
	public static void main(String[] args) {

		try {
			int i = 10;
			int j = 0;
			int k = i / j;
			System.out.println(k);

			// one try block may contain multiple catch blocks...
			// we can exception from child exception to parent exception, not parent to
			// child in catch block

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		} catch (RuntimeException e) {
			System.out.println("Run time exception catch block"); // only for example
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}