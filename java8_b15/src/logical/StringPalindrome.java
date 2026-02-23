package logical;

public class StringPalindrome {
public static void main(String[] args) {
	String name="MADAM";
	String reverse="";
	
	for(int i=name.length()-1; i>=0; i--) {
		reverse=reverse+name.charAt(i);
	}System.out.println(reverse);
	if(name.equals(reverse)) {
		System.out.println("String is palindrome");
	}else {
		System.out.println("String is not palindrome");
	}
}
}
