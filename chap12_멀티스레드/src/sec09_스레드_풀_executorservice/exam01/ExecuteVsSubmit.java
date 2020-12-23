package sec09_������_Ǯ_executorservice.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteVsSubmit {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					String threadName = Thread.currentThread().getName();
					System.out.println("�۾� ó�� by " + threadName);
				}
			};
			executorService.execute(runnable);
		}
		executorService.shutdown();
	}
}