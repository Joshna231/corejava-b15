package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentData {

	public void onMap() {
		Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(23, "joshna");
		map.put(31, "adam");
		map.put(22, "clara");
		map.put(20, "kumari");

		for (Entry<Integer, String> Entry : map.entrySet()) {

			if (Entry.getKey() == 22) {
				map.put(90, "byula");
				map.remove(23, "joshna");
			}
			System.out.println(Entry);
		}
		System.out.println("---------------------------");
		for (Entry<Integer, String> Entry : map.entrySet()) {
			System.out.println(Entry);
		}
	}

	public void onList() {
		List<Integer> li = new CopyOnWriteArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);

		for (Integer i : li) {

			if (i == 30) {
				li.add(35);
				li.remove(0);
			}
			System.out.println(i);
		}
		System.out.println("---------------------------");
		for (Integer i : li) {
			System.out.println(i);
		}

	}

	public void onSet() {
		Set<Integer> set = new CopyOnWriteArraySet<Integer>();
		set.add(5);
		set.add(10);
		set.add(15);
		set.add(20);

		for (Integer i : set) {

			if (i == 20) {
				set.add(25);
				set.remove(20);
			}
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		for (Integer i : set) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ConcurrentData cc = new ConcurrentData();
		 cc.onMap();
		// cc.onList();
		//cc.onSet();
	}
}
