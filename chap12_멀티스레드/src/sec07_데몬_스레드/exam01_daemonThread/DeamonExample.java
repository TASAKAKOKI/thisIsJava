package sec07_����_������.exam01_daemonThread;

public class DeamonExample {
	public static void main(String[] args) {
		System.out.println("MainThread: ��(����)�����尡 ���۵Ǿ����ϴ�.");
		AutoSavedThread autoSavedThread = new AutoSavedThread();
		autoSavedThread.setDaemon(true);
		System.out.println("MainThread: ���󽺷��尡 �����Ǿ����ϴ�.");
		autoSavedThread.start();
		System.out.println("MainThread: ���󽺷��� ������ ȣ���մϴ�.");
		
		try {
			System.out.println("MainThread: ���ݺ��� 3�ʰ� �Ͻ�����");
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		
		
		System.out.println("MainThread: �Ͻ����� ���� ����");
	}
}