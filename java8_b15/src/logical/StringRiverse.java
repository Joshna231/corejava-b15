package logical;

public class StringRiverse {
public static void main(String[] args) {
	String name="windows";
	
	String reverse="";
	for(int i=name.length()-1; i>=0;i--) {
		reverse=reverse+name.charAt(i);
	} System.out.println(reverse);
}
}
