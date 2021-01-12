package sec06_스레드_상태_제어.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}		
		threadA.work = false;
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}		
		threadA.work = true;
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}		
		threadA.stop = true;
		threadB.stop = true;//될 수 있으면 stop()메소드를 사용하지 않는 것이 안정성 측면에서 좋기 때문에 필드값을 이용하여, Thread를 종료시켜주는 것이 좋다.
		
	}
}