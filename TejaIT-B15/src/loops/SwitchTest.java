package loops;

public class SwitchTest {
public static void main(String[] args) {
	int i=5;
	
	switch(i) { // expression
	case 7:
		System.out.println("condition 5..");
		break;
		
	case 5:
		System.out.println("condition 7..");
		break;
		
	case 10:
		System.out.println("condition 10..");
		break;
		
	case 15:
		System.out.println("condition 15..");
		break;
		
	default:
		System.out.println("default case...");
	    break;
	}
}
}
