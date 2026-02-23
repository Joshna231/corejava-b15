package variables;

public class HyderabadCentral {

	int total =0;
	public int mobiles() {
		int realme=14000;
		int iphone=20000;
		int tecknospark=15000;
		  total=realme+iphone+tecknospark;
		return total;
	}
	
	public int appliences() {
		int fridge=15000;
		int ac=14000;
		int cooler=4000;
		 total=fridge+ac+cooler;
		return total;
	}
	
	public int electronic() {
		int laptops=50000;
		int tv=30000;
		  total=laptops+tv;
		return total;
	}
	public static void main(String[] args) {
		
		HyderabadCentral hc=new HyderabadCentral();
		
		System.out.println("mobile bill::"+hc.mobiles());
		System.out.println("appliences bill::"+hc.appliences());
		System.out.println("electronic bill::"+hc.electronic());
		
		
		int totalmobiles=hc.mobiles();
		System.out.println("mobiles bill::"+hc.mobiles());
		
		int totalappliences=hc.appliences();
		System.out.println("appliences bill::"+hc.appliences());
		
		int totalelectronics=hc.electronic();
		System.out.println("electronics bill"+hc.electronic());
		
		
		int totalbill=totalmobiles+totalappliences+totalelectronics;
		System.out.println("total bill::"+totalbill);
		
		
		
	}
}