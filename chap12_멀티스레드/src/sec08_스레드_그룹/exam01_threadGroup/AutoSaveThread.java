package sec08_������_�׷�.exam01_threadGroup;

public class AutoSaveThread extends Thread{
	@Override
	public void run() {
		System.out.println("DaemonThread: ����(����)�����尡 ���۵Ǿ����ϴ�.");
		while(true) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				break;
			}
		}
		System.out.println("DaemonThread: ���󽺷��尡 ���� ����˴ϴ�.");//�ڵ����ᰡ �Ǿ����Ƿ�, ���̻� ������� ����
	}
}