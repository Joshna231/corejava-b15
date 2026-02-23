package logical;

public class PrintCharacters {
public static void main(String[] args) {
	String val="Your Java Stop";
	int count=0;
	for(int i=0; i<val.length(); i++) {
		//system.out.println(val.charAt(i));
		char ch=val.charAt(i);
		if(ch=='a') {
			System.out.println(ch);
			count++;
		}
		}
	System.out.println(count);
	
       String[] StringArr=val.split(" ");
    for(String words:StringArr) {
    	System.out.println(words);
    }
}
}
