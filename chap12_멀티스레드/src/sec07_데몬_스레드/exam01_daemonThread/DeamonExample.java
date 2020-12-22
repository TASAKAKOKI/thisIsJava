package sec07_데몬_스레드.exam01_daemonThread;

public class DeamonExample {
	public static void main(String[] args) {
		System.out.println("MainThread: 주(메인)스레드가 시작되었습니다.");
		AutoSavedThread autoSavedThread = new AutoSavedThread();
		autoSavedThread.setDaemon(true);
		System.out.println("MainThread: 데몬스레드가 설정되었습니다.");
		autoSavedThread.start();
		System.out.println("MainThread: 데몬스레드 시작을 호출합니다.");
		
		try {
			System.out.println("MainThread: 지금부터 3초간 일시정지");
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		
		
		System.out.println("MainThread: 일시정지 이후 종료");
	}
}