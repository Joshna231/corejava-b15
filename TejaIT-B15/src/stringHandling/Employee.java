package stringHandling;

public final class Employee {
	// Final class
	// private final variables
	// create argument constructor for initializing the data
	// doesn't allow setters
	// getters for read the data
	
	private final int id;
	private final String name;
	private final String city;

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(23, "Joshna", "Guntur");
		// e1.id=200;
		System.out.println(e1.id + "  " + e1.name + " " + e1.city);
	}
}
