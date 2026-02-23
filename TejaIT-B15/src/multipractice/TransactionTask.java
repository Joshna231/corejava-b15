package multipractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionTask implements Runnable {

	private int transactionid;

	public TransactionTask(int transactionid) {
		super();
		this.transactionid = transactionid;
	}

	@Override
	public void run() {
		System.out.println("Transaction Id::" + transactionid + " is processing.. " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		es.submit(new TransactionTask(101));
		es.submit(new TransactionTask(102));
		es.submit(new TransactionTask(103));
		es.submit(new TransactionTask(104));
		es.submit(new TransactionTask(105));
		es.shutdown();

	}
}