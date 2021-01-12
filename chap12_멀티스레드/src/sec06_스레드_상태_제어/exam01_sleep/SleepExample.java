package sec06_스레드_상태_제어.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(2000); //2초간 스레드가 일시정지 상태가 된다.
			} catch(InterruptedException e) {}
		}
	}
}