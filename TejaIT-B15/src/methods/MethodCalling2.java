package methods;

public class MethodCalling2 {

	public int mobiles() {
		int realme = 10000;
		int samsung = 5000;
		int total = realme + samsung;
		System.out.println("total amount on mobiles::" + total);
		int gst = gst("mobiles", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int electronics() {
		int laptop = 15000;
		int tv = 6000;
		int total = laptop + tv;
		System.out.println("total amount on electronics::" + total);
		int gst = gst("electronics", total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int clothes() {
		int suit = 3000;
		int jeans = 2000;
		int total = suit + jeans;
		System.out.println("total amount on clothes::" + total);
		int gst = gst("clothes", total);
		System.out.println("gst amount on clothes::" + gst);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int appliances() {
		int fridge = 15000;
		int ac = 10000;
		int total = fridge + ac;
		System.out.println("total amount on appliances::" + total);
		int gst = gst("appliances", total);
		System.out.println("gst amount on appliances::" + total);
		int totalwithgst = total + gst;
		return totalwithgst;
	}

	public int gst(String catg, int bill) {
		int gstamount;
		if (catg.equals("mobiles")) {
			int sgstamt = (bill * 10) / 100;
			System.out.println("sgst on mobiles::" + sgstamt);
			int cgstamt = (bill * 20) / 100;
			System.out.println("cgst on mobiles::" + cgstamt);
			gstamount = sgstamt + cgstamt;
			System.out.println("total gst on mobiles::" + gstamount);
			int discount = (bill * 10) / 100;
			System.out.println("discount on mobiles::" + discount);
			int totalwithdiscount = bill + gstamount - discount;
			System.out.println("total with discount::" + totalwithdiscount);

		} else if (catg.equals("electronics")) {
			int sgstamt = (bill * 15) / 100;
			System.out.println("sgst on electronics::" + sgstamt);
			int cgstamt = (bill * 25) / 100;
			System.out.println("cgst on electronics::" + cgstamt);
			gstamount = sgstamt + cgstamt;
			System.out.println("total gst on electronics::" + gstamount);
			int discount = (bill * 10) / 100;
			System.out.println("dicount on electronics::" + discount);
			int totalwithdicount = bill + gstamount - discount;
			System.out.println("total with discount::" + totalwithdicount);

		} else if (catg.equals("clothes")) {
			int sgstamt = (bill * 30) / 100;
			System.out.println("sgst on clothes::" + sgstamt);
			int cgstamt = (bill * 45) / 100;
			System.out.println("cgst on clothes::" + cgstamt);
			gstamount = sgstamt + cgstamt;
			System.out.println("total gst on clothes::" + gstamount);
			int discount = (bill * 30) / 100;
			System.out.println("discount on clothes::" + discount);
			int totalwithdiscount = bill + gstamount - discount;
			System.out.println("total with discount::" + totalwithdiscount);

		} else if (catg.equals("appliances")) {
			int sgstamt = (bill * 50) / 100;
			System.out.println("sgst on appliances::" + sgstamt);
			int cgstamt = (bill * 35) / 100;
			System.out.println("cgst on appliances::" + cgstamt);
			gstamount = sgstamt + cgstamt;
			System.out.println("total gst on appliances::" + gstamount);
			int discount = 5000;
			System.out.println("discount on appliances::" + discount);
			int totalwithdiscount = bill + gstamount - discount;
			System.out.println("total with discount::" + totalwithdiscount);

		} else {
			gstamount = 18;
			System.out.println("gst amount::" + gstamount);
		}

		return gstamount;
	}

	public void totalbill() {
		int mobilesbill = mobiles();
		int electronicsbill = electronics();
		int clothesbill = clothes();
		int appliancesbill = appliances();
		int finaltotalbill = mobilesbill + electronicsbill + clothesbill + appliancesbill;
		System.out.println("final total bill::" + finaltotalbill);
	}

	public static void main(String[] args) {
		MethodCalling2 mc2 = new MethodCalling2();
		mc2.totalbill();
	}
}