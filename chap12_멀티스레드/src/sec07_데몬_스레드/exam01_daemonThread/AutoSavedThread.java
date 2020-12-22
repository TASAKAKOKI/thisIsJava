package sec07_데몬_스레드.exam01_daemonThread;

public class AutoSavedThread extends Thread{
	public void save() {
		System.out.println("DaemonThread: 작업 내용을 저장하였습니다.");
	}
	@Override
	public void run() {
		System.out.println("DaemonThread: 보조(데몬)스레드가 시작되었습니다.");
		while(true) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				break;
			}
			save();
		}
		System.out.println("DaemonThread: 데몬스레드가 정상 종료됩니다.");//자동종료가 되었으므로, 더이상 진행되지 않음
	}
}