package sec09_스레드_풀_executorservice.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
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
			System.out.println("[처리 결과] " + sum);
			System.out.println("[작업 처리 완료]");
		} catch(Exception e) {
			System.out.println("예외 발생" + e.getMessage().toString());
			executorService.shutdown();
		}
	}
}