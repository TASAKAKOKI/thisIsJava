package sec07_����_������.exam01_daemonThread;

public class DeamonExample {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " Thread: ��(����)�����尡 ���۵Ǿ����ϴ�.");
		AutoSavedThread autoSavedThread = new AutoSavedThread();
		autoSavedThread.setName("DaemonThread");
		autoSavedThread.setDaemon(true);
		System.out.println(Thread.currentThread().getName() + " Thread: ���󽺷��尡 �����Ǿ����ϴ�.");
		System.out.println("\t autoSavedThread.isDaemon(): "+ autoSavedThread.isDaemon());
		autoSavedThread.start();
		System.out.println(Thread.currentThread().getName() + " Thread: ���󽺷��� ������ ȣ���մϴ�.");
		System.out.println("\t autoSavedThread.start()");
		
		try {
			System.out.println(Thread.currentThread().getName() + " Thread: ���ݺ��� 5�ʰ� �Ͻ�����");
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " Thread: �Ͻ����� ���� ����");
	}
}