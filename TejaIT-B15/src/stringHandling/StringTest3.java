package stringHandling;

public class StringTest3 {
public static void main(String[] args) {
	String s="Teja IT";
	System.out.println(s.charAt(2));
	System.out.println(s.compareTo(s));
	System.out.println(s.concat("  Your Java Stop!"));
	System.out.println(s.contains("I"));
	System.out.println(s.endsWith("IT"));
	System.out.println(s.startsWith("T"));
	System.out.println(s.equals(s));
	System.out.println(s.equalsIgnoreCase(s));
	System.out.println(s.hashCode());
	System.out.println(s.indent(2));
	System.out.println(s.indexOf(2));
	System.out.println(s.isBlank());
	System.out.println(s.isEmpty());
	System.out.println(s.length());
	System.out.println(s.replace("Teja", "Josh"));
	
	char[] charArr=s.toCharArray();
	System.out.println(charArr);
	
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	
	String s2="Your Java Stop";
	String[] strArr=s2.split(" ");
	for(String words:strArr) {
		System.out.println(words);
	}
}
}
