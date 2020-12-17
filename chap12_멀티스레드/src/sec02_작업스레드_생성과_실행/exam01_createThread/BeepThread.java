package sec02_�۾�������_������_����.exam01_createThread;

import java.awt.Toolkit;

/* Runnable������ü�� ���� �Ű������� �������ִ� ����� ������,
 * �̹����� ThreadŬ������ ���� ����Ͽ� run()�޼ҵ带 ������ �������μ�, Thread�� ������ ���� �ִ�.
 * ���1_��������� ����Ŭ���� �����带 ����� ����ϱ�
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
/*�̷��� ������ ���� ����, Thread�� �����Ͽ� ������ �� �ִ�.* 
 * Thread thread = new BeepThread();
 * */

/*���2_Thread�͸�ü�� �����Ͽ� ����ϱ�
Thread thread = new Thread() {
	public void run() {
		//�����尡 ������ �ڵ�;
	}
}
*/

/*���������� thread.start()�� �����带 �����ų �� �ִ�.
 * */