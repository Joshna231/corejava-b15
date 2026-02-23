package collect;

import java.util.Comparator;

public class BasedOnId implements Comparator<Pedilite> {

	@Override
	public int compare(Pedilite o1, Pedilite o2) {
		// return o1.pid-o2.pid;
		return o1.pid.compareTo(o2.pid);
	}

}
