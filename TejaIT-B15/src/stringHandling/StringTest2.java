package stringHandling;

public class StringTest2 {
public static void main(String[] args) {
	// SCP (String Constant Pool) - doesn't allow duplicate
	// before creating a new object in SCP, the object will compare with .equals methods
	// if the same object available in SCP, then new object won't create
	// But in Heap, it doesn't consider duplication, because it always create new object.
	
	String s1=new String("Java");
	String s2="Teja";
	String s3=new String("Java");
	String s4="Teja";
	String s5="Java";
	String s6=new String("Teja");
	String s7="Bharath";
	String s8="Teja";
	String s9=new String("Teja");
	
	// == compares the object references (address)
	// HEAP
	System.out.println(s1==s2); // false
	System.out.println(s2==s4); // true
	System.out.println(s3==s6); // false
	System.out.println(s1==s4); // false
	System.out.println(s5==s8); // false
	System.out.println(s7==s9); // false
	
	System.out.println("--------------------------------------------");
	
	// .equals compare the content, it doesn't care about address and memory location
	// SCP
	System.out.println(s1.equals(s8)); //false
	System.out.println(s2.equals(s4)); //true
	System.out.println(s6.equals(s3)); //false
	System.out.println(s9.equals(s7)); //false
	

}
}
