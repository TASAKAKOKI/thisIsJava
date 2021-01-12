package sec06_스레드_상태_제어.exam06_stop;

public class PrintThread3 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + "실행 중");
			//아래의 방법들 처럼, 정적메소드interrupted() 또는 인스턴스 메소드 isInterrupted()메소드를 통해 일시정지를 처리하는 것이 좋다.
			if(Thread.interrupted()) { //방법1
				break;
			}
			if(isInterrupted()) { //방법2
				break;
			}
		}		
		System.out.println(Thread.currentThread().getName() + "자원 정리");
		System.out.println(Thread.currentThread().getName() + "실행 종료");
	}
}