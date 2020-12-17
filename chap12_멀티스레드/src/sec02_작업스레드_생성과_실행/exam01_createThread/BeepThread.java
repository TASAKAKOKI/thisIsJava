package sec02_작업스레드_생성과_실행.exam01_createThread;

import java.awt.Toolkit;

/* Runnable구현객체를 만들어서 매개값으로 전달해주는 방법도 있지만,
 * 이번에는 Thread클래스를 직접 상속하여 run()메소드를 재정의 해줌으로서, Thread를 생성할 수도 있다.
 * 방법1_명시적으로 하위클래스 스레드를 만들어 사용하기
 * */
public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try{Thread.sleep(700);} catch(Exception e) {}
		}
	}
}
/*이렇게 스레드 생성 이후, Thread에 대입하여 생성할 수 있다.* 
 * Thread thread = new BeepThread();
 * */

/*방법2_Thread익명객체를 생성하여 사용하기
Thread thread = new Thread() {
	public void run() {
		//스레드가 실행할 코드;
	}
}
*/

/*최종적으로 thread.start()로 스레드를 실행시킬 수 있다.
 * */