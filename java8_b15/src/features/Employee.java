package features;

public class Employee implements HR,TeamLead{

	// diamond problem - both parents contain same method, we can't say from which class we are implementing or overriding.
	// to overcome this, we can use default keyword in a method - backward compatibility.
	
	@Override
	public String company() {
		return "Infosys";
	}

	
	@Override
	public String role() {
		return TeamLead.super.role();
	}


	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.company());
		System.out.println(e.role());
		e.attendance();
		HR.location();
		TeamLead.location();
	
	}
}
