package sec02_작업스레드_생성과_실행.exam02_threadName;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("Thread-A");
	}
	@Override //Tread의 run()메소드를 재정의
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println("\t" + getName() + "가 출력한 내용입니다.");
		}
	}
}