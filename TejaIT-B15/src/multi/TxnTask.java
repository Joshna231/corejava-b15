package multi;

public class TxnTask extends Thread {

	int transactionid;

	public TxnTask(int transactionid) {
		super();
		this.transactionid = transactionid;
	}

	public void run() {
		System.out.println("Transaction Id::" + transactionid + " " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		TxnTask tx1 = new TxnTask(101);

		Thread t1 = new Thread(tx1);
		Thread t2 = new Thread(new TxnTask(102));
		Thread t3 = new Thread(new TxnTask(103));
		Thread t4 = new Thread(new TxnTask(104));
		Thread t5 = new Thread(new TxnTask(105));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

//		Thread t1 = new Thread(tx1);
//		t1.start();
//
//		TxnTask tx2 = new TxnTask(102);
//		Thread t2 = new Thread(tx2);
//		t2.start();
//
//		TxnTask tx3 = new TxnTask(103);
//		Thread t3 = new Thread(tx3);
//		t3.start();
//
//		TxnTask tx4 = new TxnTask(104);
//		Thread t4 = new Thread(tx4);
//		t4.start();
//
//		TxnTask tx5 = new TxnTask(105);
//		Thread t5 = new Thread(tx5);
//		t5.start();
	}
}