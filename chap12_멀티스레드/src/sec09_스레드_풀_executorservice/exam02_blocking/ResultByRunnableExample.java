package sec09_스레드_풀_executorservice.exam02_blocking;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ResultByRunnableExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		
		class Task implements Runnable {
			Result result;
			
			Task(Result result) {this.result = result;}

			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=100000; i++) {
					sum += i;
				}
				result.addValue(sum);
			}
		};
		
		//공유객체(외부객체)
		Result result = new Result();
		//두개의 작업을 정의
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		

		try {
			result = future1.get();
			System.out.println("[처리 결과]" + result.accumValue);
			result = future2.get();
			System.out.println("[처리 결과]" + result.accumValue);
		} catch (Exception e) {
			System.out.println("예외 발생" + e.getMessage());
		}
		System.out.println();
	}
}

/*공유 클래스 Result를 정의 */
class Result {
	int accumValue;
	
	/*동기화 블록이므로, synchronized 키워드를 적어준다.*/
	synchronized void addValue(int value) {
		accumValue += value;
	}
}