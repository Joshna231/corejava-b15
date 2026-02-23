package collectpractice;

public class Student implements Cloneable {
	int id;
	String name;

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		s1.id = 10;
		s1.name = "adam";
		System.out.println(s1.id + " " + s1.name);

		Student s2 = (Student) s1.clone();
		System.out.println(s2.id + " " + s2.name);
	}
}
