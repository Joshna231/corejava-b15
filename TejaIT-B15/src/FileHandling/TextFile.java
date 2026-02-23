package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
public static void main1(String[] args) throws IOException {
		File file = new File("C:\\Users\\chity\\Downloads\\File\\test.txt"); // file path location
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw); // Beautification

		// here we can pass file path location to write the content
		bw.write("Joshna");
		bw.newLine();
		bw.write("CoreJava");
		bw.newLine();
		bw.write("Madipadu");
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("created file successfully");
	}

public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\chity\\Downloads\\File\\test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line!= null) {
			System.out.println(line);
			line = br.readLine();
	}
		br.close();
		fr.close();
}
}
