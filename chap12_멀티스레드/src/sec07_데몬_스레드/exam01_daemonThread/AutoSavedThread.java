package sec07_����_������.exam01_daemonThread;

public class AutoSavedThread extends Thread{
	public void save() {
		System.out.println("DaemonThread: �۾� ������ �����Ͽ����ϴ�.");
	}
	@Override
	public void run() {
		System.out.println("DaemonThread: ����(����)�����尡 ���۵Ǿ����ϴ�.");
		while(true) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				break;
			}
			save();
		}
		System.out.println("DaemonThread: ���󽺷��尡 ���� ����˴ϴ�.");//�ڵ����ᰡ �Ǿ����Ƿ�, ���̻� ������� ����
	}
}