package methods;

public class Shopping1 {

	public int mobiles() {
		int redmi = 20000;
		int samsung = 15000;
		int total = redmi + samsung;
		return total;
	}

	public int clothes() {
		int dress = 5000;
		int suit = 5000;
		int total = dress + suit;
		return total;
	}

	public void totalbill() {
		int mobilesbill = mobiles();
		System.out.println("mobiles bill::" + mobilesbill);
		int clothesbill = clothes();
		System.out.println("clothes bill::" + clothesbill);
		int totalbill = mobilesbill + clothesbill;
		System.out.println("total bill::" + totalbill);
	}

	public static void main(String[] args) {
		Shopping1 sp1 = new Shopping1();
		sp1.totalbill();
	}
}