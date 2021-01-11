package sec02_작업스레드_생성과_실행.exam01_createThread;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//방법1_하위클래스 객체 이용
		Thread thread1 = new BeepThread();
		thread1.start();
		//방법2_Thread 익명객체 사용
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "에서 실행: 동시에 띵!");
					try{Thread.sleep(700);} catch(Exception e) {}
				}
			}
		};
		thread2.start();
		
		//"띵" 문자열을 5번 출력하는 작업을 생성
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "에서 실행: 띵");
			try {Thread.sleep(700);} catch(Exception e) {}
		}
		
		System.out.println();
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		thread1.setName("스레드1");
		thread2.setName("스레드2");
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}
}