package sec07_데몬_스레드.exam01_daemonThread;

public class DeamonExample {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " Thread: 주(메인)스레드가 시작되었습니다.");
		AutoSavedThread autoSavedThread = new AutoSavedThread();
		autoSavedThread.setName("DaemonThread");
		autoSavedThread.setDaemon(true);
		System.out.println(Thread.currentThread().getName() + " Thread: 데몬스레드가 설정되었습니다.");
		System.out.println("\t autoSavedThread.isDaemon(): "+ autoSavedThread.isDaemon());
		autoSavedThread.start();
		System.out.println(Thread.currentThread().getName() + " Thread: 데몬스레드 시작을 호출합니다.");
		System.out.println("\t autoSavedThread.start()");
		
		try {
			System.out.println(Thread.currentThread().getName() + " Thread: 지금부터 5초간 일시정지");
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " Thread: 일시정지 이후 종료");
	}
}