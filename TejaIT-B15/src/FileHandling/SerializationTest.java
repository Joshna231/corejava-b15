package FileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {
public static void main(String[] args) throws IOException {
	Customer c1=new Customer(20, "Joshna", 6304368169l, 118, 2331);
	System.out.println(c1);
	
	File file=new File("C:\\Users\\chity\\Downloads\\File\\Customer.txt");
	FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
					   oos.writeObject(c1);
					   oos.close();
					   fos.close();
					   System.out.println("Serialization Done...");
						
}
}
