package sec02_작업스레드_생성과_실행.exam01_createThread;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//비프음을  5번 반복해서 소리나게 하는 작업을 생성

		//방법1_Runnable 구현 객체 생성
		Runnable beepTask = new BeepTask();
		Thread thread1 = new Thread(beepTask);
		thread1.start();
		
		//방법2_Runnabel 익명객체를 매개값으로 전달
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("동시에 띵");
					try{Thread.sleep(600);} catch(Exception e) {}
				}
			}
		});
		thread2.start();
		
		//방법3_함수형인터페이스라는 점을 이용하여, 람다식으로 스레드 생성
		Thread thread3 = new Thread( () -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("나도 동시에 작업실행");
				try {Thread.sleep(600);} catch(Exception e) {}
			}
		});
		thread3.start();
	}
}