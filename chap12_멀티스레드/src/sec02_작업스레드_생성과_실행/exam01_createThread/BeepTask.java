package sec02_작업스레드_생성과_실행.exam01_createThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(600);} catch(Exception e) {}
		}
	}
}