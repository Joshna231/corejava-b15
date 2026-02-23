package collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {

	public void Hashmap() {

		// cannot executed in insertion order.
		Map<String, String> map = new HashMap<String, String>();
		map.put("GCYPP5730C", "Joshna");
		map.put("HYSIN3986G", "Adam");
		map.put("GFWE4320N", "Kumari");
		map.put("LMhd5309", "Lavanya");
		map.put("kjdtsg876", "Bhaskar");
		map.put("jhust354f", null);
		map.put(null, "clara");

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

	public void LinkedHashMapTest() {

		// executed in insertion order
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("GCYPP5730C", "Joshna");
		map.put("HYSIN3986G", "Adam");
		map.put("GFWE4320N", "Kumari");
		map.put("LMhd5309", "Lavanya");
		map.put("kjdtsg876", "Bhaskar");
		map.put("jhust354f", null);
		map.put(null, "clara");

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

	public void TreeMapTest() {

		// Insertion order can be executed in sort order or ascending order.
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(87, "Joshna");
		map.put(13, "Adam");
		map.put(05, "Kumari");
		map.put(231, "Lavanya");
		map.put(99, "Bhaskar");
		map.put(81, null);

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

	public void HashTableTest() {

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Joshna", 102);
		ht.put("Prema", 87);
		ht.put("Krishna", 54);
		ht.put("Bhari", 34);
		// ht.put(null, 90); 			// it cannot allows null key
		// ht.put("Kaveri", null); 		// it cannot allow null value

		for (Entry<String, Integer> Entry : ht.entrySet()) {
			System.out.println(Entry);

		}
	}

	public static void main(String[] args) {
		MapTest mt = new MapTest();
		//mt.Hashmap();
		//mt.LinkedHashMapTest();
		//mt.TreeMapTest();
		mt.HashTableTest();
	}
}
