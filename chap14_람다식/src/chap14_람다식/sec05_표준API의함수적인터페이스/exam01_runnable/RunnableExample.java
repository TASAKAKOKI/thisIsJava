package chap14_람다식.sec05_표준API의함수적인터페이스.exam01_runnable;


public class RunnableExample {
	public static void main(String[] args) {
		//방법1: Runnable구현 객체를 생성하여, 변수에 대입한 뒤, 생성자에 매개값으로 전달
		Runnable runnable = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		
		// 방법2: 작업객체 자체를 람다식으로 구현하여, 바로 생성자 매개값으로 전달
		Thread thread2 = new Thread(()-> {
			for(int i =0; i<10; i++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		});
		thread2.start();
		
	}
}