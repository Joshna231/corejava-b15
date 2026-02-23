package methods;

public class MethodCalling {
	int total; // declaration
	int totalval = 123; // initialization

	public int mobiles() {
		int realme = 5000;
		int samsung = 7000;
		total = realme + samsung;
		return total;
	}

	public int electronics() {
		int laptop = 5000;
		int tv = 4000;
		total = laptop + tv;
		return total;
	}

	public int appliances() {
		int fridge = 5000;
		int ac = 3000;
		total = fridge + ac;
		return total;
	}

	public int vehicles() {
		int bike = 5000;
		int car = 9000;
		total = bike + car;
		return total;
	}

	public void totalbill() {
		int mobilesbill = mobiles();
		int electronicsbill = electronics();
		int appliancesbill = appliances();
		int vehiclesbill = vehicles();
		int totalbill = mobilesbill + electronicsbill + appliancesbill + vehiclesbill;
		System.out.println(totalbill);
	}

	public static void main(String[] args) {

		MethodCalling mc = new MethodCalling();
		mc.totalbill();
	}
}