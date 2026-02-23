package oops;

public class AccountHolder {

	// encapsulation is protecting the data by using private properties
	// we can't access the data in other classes by using private properties
	// we want to access private property data then we have to use public setter and
	// getters.
	private String holdername;
	private int balance;
	private String IFSC;
	private int accountnum;

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public int getbalance() {
		return balance;
	}

	public void setbalance(int balance) {
		if (balance < 0) {
			throw new IllegalStateException("balance should be insuffient");
		}
		this.balance = balance;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String IFSC) {
		this.IFSC = IFSC;
	}

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public static void main(String[] args) {
		AccountHolder ah = new AccountHolder();
	}
}