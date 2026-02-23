package multi;

public class ATM {

	volatile boolean maintenancemode = false;

	public void transactionprocess() {
		System.out.println("customer came to transaction process");

		while (!maintenancemode) {
			// transaction process is going on
			// System.out.println("while loop is running");
		}

		System.out.println("ATM is stopped for maintenance");
	}

	public void maintenance() {
		System.out.println("Admin changing maintenace mode...");
		maintenancemode = true;
	}

	public static void main(String[] args) throws InterruptedException {
		ATM atm = new ATM();
		Thread atmtransaction = new Thread(new Runnable() {

			@Override
			public void run() {
				atm.transactionprocess();

			}
		});
		atmtransaction.start();

		Thread.sleep(4000);

		atm.maintenance();
	}
}