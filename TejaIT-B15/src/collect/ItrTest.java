package collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ItrTest {

	public void iteratorTest() { 	// non-legacy class

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void ListIteratorTest() {

		// it traverse the data from forward to backward direction.
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		ListIterator<Integer> litr = al.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("-------------------------------------");

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

	public void enumerationTest() {		// legacy class
		Vector<String> v = new Vector<String>();

		v.add("joshna");
		v.add("adam");
		v.add("kumari");
		v.add("bhaskar");
		v.add("lavanya");

		Enumeration<String> en = v.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

	public static void main(String[] args) {
		ItrTest it = new ItrTest();
		// it.iteratorTest();
		//it.ListIteratorTest();
		it.enumerationTest();
	}
}
