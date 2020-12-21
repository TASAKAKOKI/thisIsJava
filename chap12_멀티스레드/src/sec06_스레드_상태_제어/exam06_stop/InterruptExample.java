package sec06_스레드_상태_제어.exam06_stop;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread3();
		thread.start();
		
		try {
			thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		thread.interrupt();
	}
}