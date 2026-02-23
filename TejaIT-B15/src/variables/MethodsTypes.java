package variables;

public class MethodsTypes {

	
	public int m1() {
		return 123;
	}
	
	public static int m2() {
		return 1456;
	
	}
	
	
	public static void main(String[] args) {
		
		MethodsTypes mt=new MethodsTypes();
		
		System.out.println(mt.m1());
		
		System.out.println(MethodsTypes.m2());
		
	}
}