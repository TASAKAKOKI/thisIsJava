package sec06_스레드_상태_제어.exam06_stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		try {
			while(true) { //중간에 break;이 일어나지 않으면 무한반복 됨.
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}