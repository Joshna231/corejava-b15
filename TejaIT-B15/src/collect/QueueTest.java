package collect;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	public void test() {
		Queue<Integer> q = new LinkedList<>();
		q.add(23);
		q.add(31);
		q.add(98);
		q.add(86);

		q.remove(); // first-in first-out
		q.remove();
		for (Integer i : q) {
			System.out.println(i);
		}
	}
	
public void priorityqueuetest() {
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("joshna");
	pq.add("Adam");
	pq.add("Kumari");
	pq.add("Lavanya");
	
	pq.remove();
	pq.remove();
	for(String s:pq) {
		System.out.println(s);
	}
}

	public static void main(String[] args) {
		QueueTest qt = new QueueTest();
		//qt.test();
		qt.priorityqueuetest();
	}
}
