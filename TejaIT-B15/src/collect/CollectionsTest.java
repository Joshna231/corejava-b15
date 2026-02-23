package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();

		li.add(30);
		li.add(10);
		li.add(40);
		li.add(20);

		Collections.sort(li);
		Collections.reverse(li);
		for (Integer i : li) {
			System.out.println(i);
		}

		Object[] objArr = li.toArray();
		List<Object> objList = Arrays.asList(objArr);

		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> syncmap = Collections.synchronizedMap(map);

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> synclist = Collections.synchronizedList(li);

		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> syncset = Collections.synchronizedSet(set);

		List<Integer> unmodifylist = Collections.unmodifiableList(list);
	}
}
