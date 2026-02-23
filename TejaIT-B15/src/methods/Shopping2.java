package methods;

public class Shopping2 {

	public int mobiles() {
		int oppo = 12000;
		int vivo = 18000;
		int total = oppo + vivo;
		int gstbill = gst("mobiles", total);
		int totalwithgst = total + gstbill;
		return totalwithgst;
	}

	public int fashion() {
		int top = 800;
		int jeans = 1200;
		int total = top + jeans;
		int gstbill = gst("fashion", total);
		int totalwithgst = total + gstbill;
		return totalwithgst;
	}

	public int gst(String catg, int bill) {
		if (catg.equals("mobiles")) {
			int gstamt = (bill * 10) / 100;
			return gstamt;
		} else if (catg.equals("fashion")) {
			int gstamt = (bill * 18) / 100;
			return gstamt;
		}

		else {
			int gstamt = (bill * 18) / 100;
			return gstamt;
		}
	}

	public void totalbill() {
		int mobilesbill = mobiles();
		System.out.println("mobiles bill:" + mobilesbill);
		int fashionbill = fashion();
		System.out.println("fasion bill:" + fashionbill);
		int totalbill = mobilesbill + fashionbill;
		System.out.println("total bill:" + totalbill);
	}

	public static void main(String[] args) {
		Shopping2 sp2 = new Shopping2();
		sp2.totalbill();
	}
}