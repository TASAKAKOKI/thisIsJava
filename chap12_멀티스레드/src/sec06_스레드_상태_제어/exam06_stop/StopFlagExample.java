package sec06_스레드_상태_제어.exam06_stop;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start(); //이대로 실핸하면, 실행 중이라는 문자열이 계속 출력된다.
		
		try {
			Thread.sleep(100); //main스레드가 1초간 sleep() 즉, 일시정지 상태가 된다. 이때, printThread는 여전히 실행 중인 상태이다.
		} catch(InterruptedException e) {}
		
		//main스레드가 1초간 일시정지 상태였다가, 다시 실행대기 상태가 되었고, 메인 스레드가 실행되며, printThread의 stop 필드를 true로 바꿔주므로, printThread가 stop()이 된다.
		printThread.setStop(true);
	}
}