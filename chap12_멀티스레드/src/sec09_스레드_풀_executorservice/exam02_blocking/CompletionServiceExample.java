package sec09_������_Ǯ_executorservice.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		/*CompletionService��ü ����*/
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		
		/*������Ǯ���� �۾� ó�� ��û�ϱ�*/
		System.out.println("[�۾� ó�� ��û]");
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
		
		System.out.println("[ó�� �Ϸ�� �۾� Ȯ��]");
		/*������Ǯ�� �����忡�� �����ϵ��� �ϱ�*/
		executorService.submit(new Runnable() {
			public void run() {
				while(true) {
					try {
						/*�Ϸ�� �۾� ��������*/
						Future<Integer> future = completionService.take();
						int value = future.get();
						
						
					}
				}
			}
		});
		
		/* CompletionService�� poll()�� take()�޼ҵ带 �̿��ؼ� ó���Ϸ�� �۾��� Future�� ��������, 
		 * �켱, completionService�� submit()�޼ҵ�� �۾�ó�� ��û�� �ؾ� �Ѵ�.*/
		completionService.submit(Runnable task, V result);
	}
	 
}