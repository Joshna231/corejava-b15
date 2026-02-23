package variables;

public class VariablesTest {

	public int abc() {
		int a=20;
		System.out.println(a);
		a=29;
		a=15;
		System.out.println(a);
		a=23;
		System.out.println(a);
		return 0;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		VariablesTest vt=new VariablesTest();
		vt.abc();
	}
}