package sec09_스레드_풀_executorservice.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		/*CompletionService객체 생성*/
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		
		/*스레드풀에게 작업 처리 요청하기*/
		System.out.println("[작업 처리 요청]");
		for(int i=0; i<3; i++) {
			completionService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=1; i<=100; i++) {
						sum += 1;
					}
					return sum;
				}
			});
		}
		
		System.out.println("[처리 완료된 작업 확인]");
		/*스레프풀의 스레드에서 실행하도록 하기*/
		executorService.submit(new Runnable() {
			public void run() {
				while(true) {
					try {
						/*완료된 작업 가져오기*/
						Future<Integer> future = completionService.take();
						int value = future.get();
						
						
					}
				}
			}
		});
		
		/* CompletionService의 poll()과 take()메소드를 이용해서 처리완료된 작업의 Future를 얻으려면, 
		 * 우선, completionService의 submit()메소드로 작업처리 요청을 해야 한다.*/
		completionService.submit(Runnable task, V result);
	}
	 
}