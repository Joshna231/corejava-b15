package features;

public class Department implements TeamLead, HR {

	@Override
	public String role() {
		return HR.super.role();
	}

	@Override
	public String company() {
		return "Wipro";
	}

}
