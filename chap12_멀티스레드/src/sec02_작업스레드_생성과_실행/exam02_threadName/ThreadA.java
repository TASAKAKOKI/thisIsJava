package sec02_�۾�������_������_����.exam02_threadName;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("Thread-A");
	}
	@Override //Tread�� run()�޼ҵ带 ������
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println("\t" + getName() + "�� ����� �����Դϴ�.");
		}
	}
}