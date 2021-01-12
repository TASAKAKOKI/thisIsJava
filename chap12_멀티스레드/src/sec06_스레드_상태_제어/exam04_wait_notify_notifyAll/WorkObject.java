package sec06_스레드_상태_제어.exam04_wait_notify_notifyAll;

public class WorkObject {
	public synchronized void methodA() { //wait()과 notify()메소드를 호출하려면, 해당 블록이나 메소드를 동기화 처리 해주어야 한다.
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify(); //현재 일시정지 중인 스레드를 실행대기 상태로 만들어준다.
		try {
			wait();
		} catch (InterruptedException e) {} //자기 자신(현재 methodA를 호출한 스레드)은 일시정지 상태로 만들어준다.
	}
	
	public synchronized void methodB() { //wait()과 notify()메소드를 호출하려면, 해당 블록이나 메소드를 동기화 처리 해주어야 한다.
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify(); //현재 일시정지 중인 스레드를 실행대기 상태로 만들어준다.
		try {
			wait();
		} catch (InterruptedException e) {} //자기 자신(현재 methodB를 호출한 스레드)은 일시정지 상태로 만들어준다.
	}
}