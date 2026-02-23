package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.swing.text.Element;

public class FailSafeTest {

	public void onMap() {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(23, "joshna");
		map.put(31, "adam");
		map.put(80, "kumari");
		map.put(54, "lavanya");

		for (Entry<Integer, String> Entry : map.entrySet()) {

			if (Entry.getKey() == 31) {
				// map.put(30, "clara");
				map.remove(31);
			}

			System.out.println(Entry);
		}

		System.out.println("===================================");
		for (Entry<Integer, String> Entry : map.entrySet()) {
			System.out.println(Entry);
		}
	}

	public void onList() {
		List<Integer> li = new CopyOnWriteArrayList<Integer>();
		li.add(23);
		li.add(31);
		li.add(98);
		li.add(54);

		for (Integer i : li) {

			if (i == 23) {
				li.add(30);
				li.remove(1);

			}
			System.out.println(i);
		}
		System.out.println("===========================");
		for (Integer i : li) {
			System.out.println(i);
		}
	}

	public void onSet() {
		Set<Integer> set = new CopyOnWriteArraySet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		for (Integer i : set) {
			
			set.add(35);
			set.remove(2);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		FailSafeTest fst = new FailSafeTest();
		// fst.onMap();
		// fst.onList();
		fst.onSet();
	}
}
