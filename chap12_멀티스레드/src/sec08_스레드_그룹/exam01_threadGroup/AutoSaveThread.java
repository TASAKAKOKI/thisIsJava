package sec08_스레드_그룹.exam01_threadGroup;

public class AutoSaveThread extends Thread{
	@Override
	public void run() {
		System.out.println("DaemonThread: 보조(데몬)스레드가 시작되었습니다.");
		while(true) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				break;
			}
		}
		System.out.println("DaemonThread: 데몬스레드가 정상 종료됩니다.");//자동종료가 되었으므로, 더이상 진행되지 않음
	}
}