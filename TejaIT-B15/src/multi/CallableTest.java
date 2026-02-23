package multi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "Your Java Stop!";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> fut = es.submit(new CallableTest());
		System.out.println(fut.get());
		es.shutdown();

	}
}
