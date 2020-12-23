package sec09_스레드_풀_executorservice.exam01;

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
					System.out.println("작업 처리 by " + threadName);
				}
			};
			executorService.execute(runnable);
		}
		executorService.shutdown();
	}
}