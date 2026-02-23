package loops;

public class BookMyShow {

	public void ticketbooking(String catg) {
		if (catg.equals("gold")) {
			System.out.println("your seat allocated in gold category");

		} else if (catg.equals("platinum")) {
			System.out.println("your allotted in platinum categroy");
		} else if (catg.equals("silver")) {
			System.out.println("your seat allotted in silver category");
		} else {
			System.out.println("your seat allotted in normal ticket");
		}
	}

	public static void main(String[] args) {
		BookMyShow bms = new BookMyShow();
		bms.ticketbooking("platinum");
	}
}