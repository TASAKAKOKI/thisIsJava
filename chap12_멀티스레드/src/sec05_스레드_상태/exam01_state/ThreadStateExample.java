package sec05_스레드_상태.exam01_state;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread thread = new StatePrintThread(new TargetThread());
		thread.start();
	}
}