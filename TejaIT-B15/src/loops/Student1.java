package loops;

public class Student1 {

	public void result(int marks) {
		if (marks >= 28 && marks <= 50) {
			System.out.println("passed in 3rd class");
		} else if (marks >= 51 && marks <= 75) {
			System.out.println("passed in 2nd class");
		} else if (marks >= 76 && marks <= 100) {
			System.out.println("passed in 3rd class");
		} else {
			System.out.println("student failed");
		}
	}

	public static void main(String[] args) {

		Student1 st1 = new Student1();
		st1.result(88);
	}
}