package sec05_스레드_상태;

public class StatePrintThread extends Thread{
	/*Thread.State 열거상수  Enum Constant
		 *NEW:스레드 객체가 생성된 상태, 아직 start()메소드가 호출되지 않은 상태
		 *RUNNABLE: 실행 상태로 언제든지 갈 수 있는 상태
		 *BLOCKED: 사용하조가 하는 객체의 락이 풀릴 때 까지(동기화가 끝날 때까지) 기다리는 상태
		 *WAITING: 다른 스레드가 실행상태를 통지할 때까지 기다리는 상태
		 *TIMED_WAITING: 주어진 시간 동안 기다리는상태 (e.g, sleep(int))
		 *TERMINATED: 실행을 마친 상태
		 *스레드는 한번 만들어지고 종료되면, 더이상 사용 불가, 다시 사용하고 싶다면 재생성해야한다.
	*/
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); //해당 스레드의 상태를 반환(열거상수타입::Thread.State)
			System.out.println("타겟 스레드의 상태: " + state);
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}