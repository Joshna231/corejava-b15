package methods;

public class Trends {

	public int vegetables() {
		int tomatoes = 200;
		int potatoes = 300;
		int brinjals = 100;
		int total = tomatoes + potatoes + brinjals;
		System.out.println("total amount of vegetables:" + total);
		int gst = gst("vegetables", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int mobiles() {
		int oppo = 10000;
		int motorola = 8000;
		int nothing = 15000;
		int total = oppo + motorola + nothing;
		System.out.println("total amount of mobiles::" + total);
		int gst = gst("mobiles", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int clothes() {
		int dress = 3000;
		int suit = 5000;
		int saree = 7000;
		int total = dress + suit + saree;
		System.out.println("total amount of clothes::" + total);
		int gst = gst("clothes", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int toys() {
		int doll = 100;
		int teddy = 1000;
		int car = 1500;
		int total = doll + teddy + car;
		System.out.println("total amount of toys::" + total);
		int gst = gst("toys", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int gst(String catg, int bill) {

		int gstamt = 0;

		if (catg.equals("vegetables")) {
			int sgstamt = (bill * 10) / 100;
			System.out.println("sgst on vegetables::" + sgstamt);
			int cgstamt = (bill * 15) / 100;
			System.out.println("cgst on vegetables::" + cgstamt);
			gstamt = sgstamt + cgstamt;
			System.out.println("total gst amount on vegetables::" + gstamt);
			int discount = 20;
			int totalwithdiscount = bill + gstamt - discount;
			System.out.println("total with discount::" + totalwithdiscount);

		} else if (catg.equals("mobiles")) {
			int sgstamt = (bill * 20) / 100;
			System.out.println("sgst on mobiles::" + sgstamt);
			int cgstamt = (bill * 25) / 100;
			System.out.println("cgst on mobiles::" + cgstamt);
			gstamt = sgstamt + cgstamt;
			System.out.println("total gst amount on mobiles::" + gstamt);
			int discount = 1000;
			int totalwithdiscount = bill + gstamt - discount;
			System.out.println("total with discount::" + totalwithdiscount);

		} else if (catg.equals("clothes")) {
			int sgst = (bill * 30) / 100;
			System.out.println("sgst on clothes::" + sgst);
			int cgst = (bill * 35) / 100;
			System.out.println("cgst on clothes::" + cgst);
			gstamt = sgst + cgst;
			System.out.println("total gst amount on clothes::" + gstamt);
			int discount = 200;
			int totalwithdiscount = bill + gstamt - discount;
			System.out.println("total with discount::" + totalwithdiscount);

		} else if (catg.equals("toys")) {
			int sgst = (bill * 40);
			System.out.println("sgst on toys::" + sgst);
			int cgst = (bill * 45);
			System.out.println("cgst on toys::" + cgst);
			gstamt = sgst + cgst;
			System.out.println("total gst amount on toys::" + gstamt);
			int discount = 100;
			int totalwithdiscount = bill + gstamt - discount;
			System.out.println("total with discount::" + totalwithdiscount);
		}

		return gstamt;
	}

	public void totalbill() {
		int vegetablesbill = vegetables();
		int mobilesbill = mobiles();
		int clothesbill = clothes();
		int toysbill = toys();
		int totalbill = vegetablesbill + mobilesbill + clothesbill + toysbill;
		System.out.println("total bill::" + totalbill);
	}

	public static void main(String[] args) {
		Trends td = new Trends();
		td.totalbill();

	}
}