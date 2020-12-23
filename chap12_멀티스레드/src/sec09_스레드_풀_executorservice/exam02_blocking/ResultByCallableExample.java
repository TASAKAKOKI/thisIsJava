package sec09_������_Ǯ_executorservice.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾� ó�� ��û]");
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1; i<=10000     ; i++) {sum += i;}
				return sum;
			}
		};
		Future future = executorService.submit(callable);
		
		try {
			int sum = (int) future.get();
			System.out.println("[ó�� ���] " + sum);
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch(Exception e) {
			System.out.println("���� �߻�" + e.getMessage().toString());
			executorService.shutdown();
		}
	}
}