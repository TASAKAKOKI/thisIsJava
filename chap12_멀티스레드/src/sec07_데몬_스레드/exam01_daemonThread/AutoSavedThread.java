package sec07_����_������.exam01_daemonThread;

public class AutoSavedThread extends Thread{
	public void save() {
		System.out.println(Thread.currentThread().getName() + "�� �۾� ������ �����Ͽ����ϴ�.");
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "�� ���۵Ǿ����ϴ�.");
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				break;
			}
			save();//1�ʸ��� save()�� ȣ��
		}
		System.out.println(Thread.currentThread().getName() + "�� ���� ����˴ϴ�.");//�ڵ����ᰡ �Ǿ����Ƿ�, ���̻� ������� ����
	}
}