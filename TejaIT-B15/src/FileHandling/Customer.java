package FileHandling;

import java.io.Serializable;

public class Customer implements Serializable {
	int cid;
	String name;
	long cardnum;
	transient int cvv;	// cannot serialize
	static int pin;		// cannot serialize

	public Customer(int cid, String name, long cardnum, int cvv, int pin) {
		super();
		this.cid = cid;
		this.name = name;
		this.cardnum = cardnum;
		this.cvv = cvv;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cardnum=" + cardnum + ", cvv=" + cvv + " pin=" + pin + "]";
	}

}
