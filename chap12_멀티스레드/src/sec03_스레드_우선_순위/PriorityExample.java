package sec03_������_�켱_����;

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