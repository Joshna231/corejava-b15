package loops;

public class Student {

	public void result(int marks) {
		if (marks > 35 && marks <= 50) {
			System.out.println("pass in 3rd class");
		} else if (marks > 50 && marks <= 75) {
			System.out.println("pass in 2nd class");
		} else if (marks > 75 && marks <= 100) {
			System.out.println("pass in 1st class");
		} else {
			System.out.println("student failed..");
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.result(94);
	}
}