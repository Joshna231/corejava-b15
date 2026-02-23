package multipractice;

public class Customer {

	int bankbal = 1000;

	public void withdraw(int withdrawamount) throws InterruptedException {
		System.out.println("customer came to withdraw amount");
		if (bankbal < withdrawamount) {
			System.out.println("sorry sir, we don't have enough amount..please wait");
			wait();
		}

		System.out.println("customer withdraw amount successfully...");
		bankbal = bankbal - withdrawamount;
	}

	public void deposit(int depositamount) {
		System.out.println("customer came to deposit amount");
		bankbal = bankbal + depositamount;
		System.out.println("customer deposit amount successfully...");
		notify();
	}
}