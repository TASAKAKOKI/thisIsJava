package sec03_스레드_우선_순위;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=0; i<=8; i++) {
			Thread thread = new CalcThread("Thread" + i);
			if(i!=8) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}