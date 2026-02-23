package methods;

public class Shopping3 {

	public int mobiles() {
		int oppo = 10000;
		int vivo = 20000;
		int total = oppo + vivo;
		System.out.println("mobiles bill:" + total);
		int gstbill = gst("mobiles", total);
		System.out.println("gst on mobiles:" + gstbill);
		int totalwithgst = total + gstbill;
		System.out.println("total with gst on mobiles:" + totalwithgst);
		return totalwithgst;
	}

	public int fashion() {
		int shirt = 600;
		int tshirt = 400;
		int total = shirt + tshirt;
		System.out.println("fashion bill:" + total);
		int gstbill = gst("fashion", total);
		System.out.println("gst on fashion:" + gstbill);
		int totalwithgst = total + gstbill;
		System.out.println("total with gst on fashion:" + totalwithgst);
		return totalwithgst;
	}

	public int electronics() {
		int laptop = 20000;
		int tv = 5000;
		int total = laptop + tv;
		System.out.println("electronics bill:" + total);
		int gstbill = gst("electronics", total);
		System.out.println("gst on electronics:" + gstbill);
		int totalwithgst = total + gstbill;
		System.out.println("total with gst on electronics:" + totalwithgst);
		return totalwithgst;
	}

	public int toys() {
		int teddy = 1000;
		int doll = 200;
		int total = teddy + doll;
		System.out.println("toys bill:" + total);
		int gstbill = gst("toys", total);
		System.out.println("gst on toys:" + gstbill);
		int totalwithgst = total + gstbill;
		System.out.println("total with gst on toys:" + totalwithgst);
		return totalwithgst;
	}

	public int gaming() {
		int chess = 5000;
		int carroms = 1000;
		int total = chess + carroms;
		System.out.println("gaming bill:" + total);
		int gstbill = gst("gaming", total);
		System.out.println("gst on gaming:" + gstbill);
		int totalwithgst = total + gstbill;
		System.out.println("total with gst on gaming:" + totalwithgst);
		return totalwithgst;
	}

	public int gst(String catg, int bill) {
		int gstamt = 0;
		if (catg.equals("mobiles")) {
			gstamt = (bill * 15) / 100;
		} else if (catg.equals("fashion")) {
			gstamt = (bill * 10) / 100;
		} else if (catg.equals("toys")) {
			gstamt = (bill * 30) / 100;
		} else {
			gstamt = (bill * 20) / 100;
		}
		return gstamt;
	}

	public int discount(int totalbill) {

		if (totalbill > 5000 && totalbill < 10000) {
			int discount = (totalbill * 10) / 100;
			return discount;
		} else if (totalbill > 10000 && totalbill < 35000) {
			int discount = (totalbill * 15) / 100;
			return discount;
		} else if (totalbill > 35000 && totalbill < 50000) {
			int discount = (totalbill * 20) / 100;
			return discount;
		} else if (totalbill > 50000 && totalbill < 80000) {
			int discount = (totalbill * 25) / 100;
			return discount;
		} else if (totalbill > 80000) {
			int discount = (totalbill * 30) / 100;
			return discount;
		} else {
			int discount = (totalbill * 5) / 100;
			return discount;
		}
	}

	public void totalbill() {
		int mobilesbill = mobiles();
		int fashionbill = fashion();
		int electronicsbill = electronics();
		int toysbill = toys();
		int gamingbill = gaming();
		int totalbill = mobilesbill + fashionbill + electronicsbill + toysbill + gamingbill;
		System.out.println("total bill:" + totalbill);
		int discount = discount(totalbill);
		System.out.println("total to pay:" + discount);

	}

	public static void main(String[] args) {
		Shopping3 sp3 = new Shopping3();
		sp3.totalbill();
	}
}