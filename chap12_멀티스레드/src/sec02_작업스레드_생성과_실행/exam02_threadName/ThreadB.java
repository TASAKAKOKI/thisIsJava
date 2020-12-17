package sec02_작업스레드_생성과_실행.exam02_threadName;

public class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println("\t" + getName() + "가 출력한 내용입니다.");
		}
	}
	
}