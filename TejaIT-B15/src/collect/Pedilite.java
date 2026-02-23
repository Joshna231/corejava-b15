package collect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pedilite {
	Integer pid;
	String pname;
	Double price;

	public Pedilite(Integer pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pedilite [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Pedilite p1 = new Pedilite(104, "Fevicol", 10.7);
		Pedilite p2 = new Pedilite(108, "M-seal", 22.64);
		Pedilite p3 = new Pedilite(101, "Fevikwik", 12.98);
		Pedilite p4 = new Pedilite(116, "Anabond", 25.60);

		List<Pedilite> list = Arrays.asList(p1, p2, p3, p4);

		BasedOnId onid = new BasedOnId();
		// Collections.sort(list, new BasedOnId);

		// Collections.sort(list, new BasedOnName());

		// Collections.sort(list, new BasedOnPrice()); // new BasedOnPrice = constructor

		String property = "pid";
		String ordertype = "DESC";

		if (property.equals("pname")) {
			Collections.sort(list, new BasedOnName());
		} else if (property.equals("pid")) {
			Collections.sort(list, new BasedOnId());
		} else if (property.equals("price")) {
			Collections.sort(list, new BasedOnPrice());
		}

		if (ordertype.equals("DESC")) {
			Collections.reverse(list);
		}

		for (Pedilite p : list) {
			System.out.println(p);
		}
	}
}
