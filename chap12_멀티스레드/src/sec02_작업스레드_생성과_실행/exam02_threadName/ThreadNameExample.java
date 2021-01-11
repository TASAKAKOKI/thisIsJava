package sec02_작업스레드_생성과_실행.exam02_threadName;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread1 = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + thread1.getName());
		
		Thread thread2 = new ThreadA();//setName()정적메소드를 사용하여 스레드이름을 변경하였다.
		System.out.println(thread2.getName() + "를 생성한 스레드: " + Thread.currentThread().getName());
		System.out.println("\t작업 스레드 이름: " + thread2.getName());
		thread2.start();
		
		Thread thread3 = new ThreadB(); //default값이 스레드이름으로 설정되어 있다.
		System.out.println(thread3.getName() + "를 생성한 스레드: " + Thread.currentThread().getName());
		System.out.println("\t작업 스레드 이름: " + thread3.getName());
		thread3.start();
	}
}