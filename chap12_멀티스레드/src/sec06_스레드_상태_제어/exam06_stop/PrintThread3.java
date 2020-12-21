package sec06_스레드_상태_제어.exam06_stop;

public class PrintThread3 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) { //방법1
				break;
			}
			if(isInterrupted()) { //방법2
				break;
			}
		}		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}