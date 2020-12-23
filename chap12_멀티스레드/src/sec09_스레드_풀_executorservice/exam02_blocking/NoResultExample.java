package sec09_������_Ǯ_executorservice.exam02_blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[�۾� ó�� ��û]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10000     ; i++) {sum += i;}
				System.out.println("[ó�� ���] " + sum);
			}
		};
		Future future = executorService.submit(runnable);
		try {
			future.get();
			System.out.println(future.get());
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch(InterruptedException e) {
			System.out.println("InterruptedException �߻�" + e.getMessage().toString());
			executorService.shutdown();
		} catch(ExecutionException e) {
			System.out.println("ExecutionException �߻�" + e.getMessage());
			executorService.shutdown();
		}
	}
}