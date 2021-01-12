package sec06_스레드_상태_제어.exam04_wait_notify_notifyAll;

public class ThreadB extends Thread{
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			workObject.methodB();
		}
	}
}