package sec06_스레드_상태_제어.exam06_stop;

public class PrintThread1 extends Thread{
	private boolean stop; //stop 플래그 필드
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) { //stop이 true가 되면 run()이 종료된다.
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}