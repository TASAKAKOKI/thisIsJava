package sec02_�۾�������_������_����.exam01_createThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	@Override
	public void run() {
		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(600);} catch(Exception e) {}
		}
	}
}