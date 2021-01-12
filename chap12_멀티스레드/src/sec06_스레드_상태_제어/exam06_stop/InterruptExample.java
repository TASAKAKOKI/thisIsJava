package sec06_스레드_상태_제어.exam06_stop;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread2 = new PrintThread2();
		thread2.setName("PrintThread-2");
		thread2.start();
		
		Thread thread3 = new PrintThread3();
		thread3.setName("PrintThread-3");
		thread3.start();
		 
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {}
		
		thread2.interrupt();
		thread3.interrupt();
	}
}