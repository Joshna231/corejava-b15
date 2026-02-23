package oops;

public class Account implements ATMService, OnlineService {

	// 1 parent has multiple child - multiple inheritance

	public void fundtransfer() {
		System.out.println("funds transferring using online service");
	}

	public void withdraw() {
		System.out.println("amount withdraw using ATM service");
	}

	public void dispute() {
		System.out.println("dispute amount in online service");

	}

	public static void main(String[] args) {
		Account a = new Account();
		a.fundtransfer();
		a.withdraw();
	}
}