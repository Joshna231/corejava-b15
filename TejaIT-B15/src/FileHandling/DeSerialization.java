package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\chity\\Downloads\\File\\Customer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();

		Customer c = (Customer) obj;
		System.out.println(c);
		fis.close();
		ois.close();
	}
}
