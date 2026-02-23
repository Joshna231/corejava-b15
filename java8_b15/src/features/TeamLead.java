package features;

public interface TeamLead {

	public String company();

	public default String role() {
		return "technique team lead";
	}

	public static void location() {
		System.out.println("Hyderabad");
	}
}
