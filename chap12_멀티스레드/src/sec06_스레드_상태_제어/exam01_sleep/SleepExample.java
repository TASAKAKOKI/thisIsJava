package sec06_������_����_����.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(2000); //2�ʰ� �����尡 �Ͻ����� ���°� �ȴ�.
			} catch(InterruptedException e) {}
		}
	}
}