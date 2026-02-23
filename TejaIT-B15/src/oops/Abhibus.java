package oops;

public class Abhibus implements Phonepe {

	@Override
	public void ticketbooking() {
		String from = "madipadu";
		String to = "guntur";
		String name = "joshna";
		int ticketprice = 300;

		System.out.println("from:" + from);
		System.out.println("to:" + to);
		System.out.println("name:" + name);
		System.out.println("ticket price:" + ticketprice);

	}

	public static void main(String[] args) {
		Abhibus ab = new Abhibus();
		ab.ticketbooking();
		System.out.println(Abhibus.id);
	}
}