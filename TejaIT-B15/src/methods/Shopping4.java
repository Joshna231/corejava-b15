package methods;

public class Shopping4 {

	public int mobiles() {
		int oppo = 5000;
		int vivo = 10000;
		int total = oppo + vivo;
		System.out.println("mobiles bill:" + total);
		return total;
	}

	public int clothes() {
		int top = 800;
		int shirt = 500;
		int total = top + shirt;
		System.out.println("clothes bill:" + total);
		return total;
	}

	public int books() {
		int telugu = 200;
		int english = 300;
		int total = telugu + english;
		System.out.println("books bill:" + total);
		return total;
	}

	public int gst(String catg, int bill) {
		int gstamt;
		if (catg.equals("mobiles")) {
			int sgst = (bill * 10) / 100;
			int cgst = (bill * 15) / 100;
			gstamt = sgst + cgst;
		} else if (catg.equals("clothes")) {
			int sgst = (bill * 8) / 100;
			int cgst = (bill * 12) / 100;
			gstamt = sgst + cgst;
		} else if (catg.equals("books")) {
			int sgst = (bill * 5) / 100;
			int cgst = (bill * 2) / 100;
			gstamt = sgst + cgst;
		} else {
			int sgst = (bill * 18) / 100;
			int cgst = (bill * 20) / 100;
			gstamt = sgst + cgst;
		}
		return gstamt;
	}

	public int discount(int totalbill) {

		if (totalbill > 10000 && totalbill < 30000) {
			int discount = (totalbill * 20) / 100;
			return discount;
		} else if (totalbill > 5000 && totalbill < 15000) {
			int discount = (totalbill * 30) / 100;
			return discount;
		} else if (totalbill > 15000 && totalbill < 35000) {
			int discount = (totalbill * 40) / 100;
			return discount;
		} else if (totalbill > 35000 && totalbill < 50000) {
			int discount = (totalbill * 45) / 100;
			return discount;
		} else if (totalbill > 50000) {
			int discount = (totalbill * 48) / 100;
			return discount;
		} else {
			int discount = (totalbill * 5) / 100;
			return discount;
		}
	}

	public void totalbill() {
		int mobilesbill = mobiles();
		int clothesbill = clothes();
		int booksbill = books();
		int totalbill = mobilesbill + clothesbill + booksbill;
		System.out.println("total bill:" + totalbill);
		int gst = (totalbill);
		System.out.println("total gst:" + gst);
		int discount = discount(totalbill);
		System.out.println("total with discount:" + discount);
	}

	public static void main(String[] args) {
		Shopping4 sp4 = new Shopping4();
		sp4.totalbill();
	}
}