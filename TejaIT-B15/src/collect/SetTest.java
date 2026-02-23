package collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public void HashSetTest() {

		// it cannot follows insertion order
		Set<Integer> set = new HashSet<Integer>();
		set.add(90);
		set.add(23);
		set.add(31);
		set.add(73);
		set.add(null);	// it allows null
		set.add(23); // it can override the duplicate element

		for (Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------");
	}

	public void LinkedHashSetTest() {

		// it follows insertion order
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(07);
		set.add(23);
		set.add(31);
		set.add(74);
		set.add(23); 	// it can override the duplicate element value
		set.add(null);	// it allows null

		for (Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------");
	}

	public void TreeSetTest() {

		// it follows sorting order
		Set<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(23);
		set.add(64);
		set.add(31);
		set.add(23);	// it can override the duplicate element value
		//set.add(null);  // it cannot allow "null"

		for (Integer i : set) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.HashSetTest();
		st.LinkedHashSetTest();
		st.TreeSetTest();
	}
}
