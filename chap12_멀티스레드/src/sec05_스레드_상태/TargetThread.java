package sec05_스레드_상태;

public class TargetThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 1000000000; i++) {}
				
		try {
			Thread.sleep(1500);//스레드를 1.5초간(1500ms) TIMED_WAITING상태로 전환시키며, 이 호출은 예외가 발생할 수 있으므로 try catch문으로 처리해준다.
		} catch(Exception e) {
			
		}
		for(long i = 0; i < 1000000000; i++) {}
	}
}