package sec06_스레드_상태_제어.exam04_wait_notify_notifyAll;

public class ThreadA extends Thread{
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			workObject.methodA();
		}
	}
}