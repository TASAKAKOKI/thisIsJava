package sec08_스레드_그룹.exam01_threadGroup;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("\t" + getName() + " interrupted");
				break;
			}
		}
		System.out.println("\t" + getName() + "가 종료됨");
	}
}