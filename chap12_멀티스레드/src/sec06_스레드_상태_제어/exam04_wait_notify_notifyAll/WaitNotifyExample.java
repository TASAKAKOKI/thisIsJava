package sec06_������_����_����.exam04_wait_notify_notifyAll;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		threadA.start();
		threadB.start();
	}
}