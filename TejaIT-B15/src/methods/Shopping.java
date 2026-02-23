package methods;

public class Shopping {
	int total;
	int billwithtax;
	int tax;
	int Gst;

	public int mobiles() {
		int realme = 12000;
		int samsung = 14000;
		int tax = 2000;
		int Gst = 20;
		total = realme + samsung + tax + Gst;
		return total;
	}

	public int electronics() {
		int tv = 12000;
		int laptop = 15000;
		int tax = 2000;
		int Gst = 20;
		int total = tv + laptop + tax + Gst;
		return total;
	}

	public int clothes() {
		int suit = 3000;
		int jeans = 1000;
		int tax = 2000;
		int Gst = 20;
		total = suit + jeans + tax + Gst;
		return total;
	}

	public int tax(int bill) {
		int withtax = bill + 2000;
		return withtax;
	}

	public int Gst(int bill) {
		int withGst = bill + 20;
		return withGst;
	}

	public void totalbill() {
		int mobilesbill = mobiles();
		System.out.println("mobiles bill::" + mobilesbill);
		int electronicsbill = electronics();
		System.out.println("electronics bill::" + electronicsbill);
		int clothesbill = clothes();
		System.out.println("clothes bill::" + clothesbill);
		int finaltotalbill = mobilesbill + electronicsbill;
		System.out.println("finaltotalbill::" + finaltotalbill);
	}

	public static void main(String[] args) {
		Shopping s1 = new Shopping();
		s1.totalbill();
	}
}