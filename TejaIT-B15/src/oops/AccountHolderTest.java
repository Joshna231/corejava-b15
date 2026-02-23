package oops;

public class AccountHolderTest {

	public static void main(String[] args) {

		AccountHolder ah = new AccountHolder();
		ah.setHoldername("joshna"); // setter - initialization
		ah.setbalance(1000); // write - save, update and delete
		ah.setIFSC("SBIN00000092");
		ah.setAccountnum(7418812);

		System.out.println(ah.getHoldername()); // getter - read the data
		System.out.println(ah.getbalance());
		System.out.println(ah.getIFSC());
		System.out.println(ah.getAccountnum());
	}
}