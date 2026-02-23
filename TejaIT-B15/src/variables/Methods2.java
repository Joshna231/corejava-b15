package variables;

public class Methods2 {

	public int mobileprice() {
		System.out.println("mobileprice method called");
		return 124;
	}
	
	public short amtprice() {
		System.out.println("amtprice method called");
		return 2000;
	}
	
	public int val() {
		System.out.println("val method called");
		return 123;
	}
	
	public long mobile() {
		System.out.println("mobile method called");
		return 7416501067l;
	}
	
	public double balance() {
		System.out.println("balance method called");
		return 5000.00;
	}
	
	public float distance() {
		System.out.println("distance methos called");
		return 3.35f;
	}
	
	public char grade() {
		System.out.println("grade method called");
		return 's';
	}
		
	
	public boolean areyoudrawing() {
		System.out.println("areyoudrawing method called");
		return true;
	}
	
	public String name() {
		System.out.println("name method called");
		return "krishna";
	}
	
	public void nothing() {
		System.out.println("nothing method called");
		
	}
	
	public static void main(String[] args) {
		
		Methods2 m2=new Methods2();
		
		int mobileprice=m2.mobileprice();
		System.out.println(mobileprice);
		
		short amtprice=m2.amtprice();
		System.out.println(amtprice);
		
		int val=m2.val();
		System.out.println(val);
		
		long mobile=m2.mobile();
		System.out.println(mobile);
		
		double balance=m2.balance();
		System.out.println(balance);
		
		float distance=m2.distance();
		System.out.println(distance);
		
		String name=m2.name();
		System.out.println(name);
		
		char grade=m2.grade();
		System.out.println(grade);
		
		boolean areyoudrawing=m2.areyoudrawing();
		System.out.println(areyoudrawing);
		
		m2.nothing();
		
		
	}

	
}