package collect;

public class Employee {
	int id;
	String name;
	String city;

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Employee() {

	}

	public static void main(String[] args) {
		Employee e1 = new Employee(5, "joshna", "Guntur");
		System.out.println(e1.id + "  " + e1.name + "  " + e1.city);

		Employee e2 = new Employee();
		e2.id = 20;
		e2.name = "adam";
		e2.city = "Chennai";
		System.out.println(e2.id + "  " + e2.name + "  " + e2.city);

		// Deep copy
		Employee e3 = new Employee();
		e3.id = e2.id;
		e3.name = e2.name;
		e3.city = e2.city;
		System.out.println(e3.id + "  " + e3.name + "  " + e3.city);

		// Shallow copy - it is nothing but clone();
		Employee e4 = new Employee();
		e4 = e3;
		System.out.println(e4.id + "  " + e4.name + "  " + e4.city);
	}
}
