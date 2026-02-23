package stringHandling;

public class StringTest1 {
public static void main(String[] args) {
	// String is characters of sequence or character array
	// string is an objective type
	// string is a class
	// string is immutable class
	
	char[] ch= {'j', 'o', 's', 'h', 'n', 'a'};
	System.out.println(ch);
	
	String s1=new String(ch);
	System.out.println(s1);
	
	String name="Joshna";		// string literal
	System.out.println(name);
	
	String name2=new String("Adam");	// string object, it contains string literal
	System.out.println(name2);
}
}
