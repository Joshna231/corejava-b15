package collectpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts> {
	private int id;
	private String name;
	private double price;

	public TataProducts(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(TataProducts o) {
		// return this.id - o.id;
		// return (int) (this.price - o.price);
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "TataProducts [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		TataProducts t1 = new TataProducts(10, "Joshna", 17.09);
		TataProducts t2 = new TataProducts(90, "Adam", 13.87);
		TataProducts t3 = new TataProducts(40, "Kumari", 89.54);
		TataProducts t4 = new TataProducts(60, "Lavanya", 26.59);

		List<TataProducts> list = new ArrayList<TataProducts>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);

		Collections.sort(list);

		for (TataProducts i : list) {
			System.out.println(i);
		}
	}
}
