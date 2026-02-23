package multipractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 23;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Integer> fut = es.submit(new CallableTest());
		System.out.println(fut.get());
		es.shutdown();
	}
}
