package variables;

public class Methods1 {
                                                         //instance methods
	public byte id() {
		return 123;
	}
	
	
	public short num() {
		return 1564;
		
	}
	public int value() {
		return 7416;
		
	}
	public long mobile() {
		return 741650;
	
	}
	public double amt() {
		return 1234;
		
	}
	public float miles() {
		return 7895f;
	}
	
	public char grade() {
		return 'a';
	}
	
	public boolean areyoucrying() {
		return true;
	}
	public static void main(String[] args) {
		Methods1 m1=new Methods1();
		
		System.out.println(m1.id());
		System.out.println(m1.num());
		System.out.println(m1.value());
		System.out.println(m1.mobile());
		System.out.println(m1.amt());
		System.out.println(m1.miles());
		System.out.println(m1.grade());
		System.out.println(m1.areyoucrying());
		
		
		
		byte id=m1.id();
		System.out.println(id);
        
		short num=m1.num();
		System.out.println(num);
		
		int value=m1.value();
		System.out.println(num);
		 
		long mobile=m1.mobile();
		System.out.println(mobile);
		
		double amt=m1.amt();
		System.out.println(amt);
		
		float miles=m1.miles();
		System.out.println(miles);
		
		char grade=m1.grade();
		System.out.println(grade);
		
		boolean areyoucrying=m1.areyoucrying();
		System.out.println(areyoucrying);
		
		
		
				
	}
}