package sec06_������_����_����.exam06_stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		try {
			while(true) { //�߰��� break;�� �Ͼ�� ������ ���ѹݺ� ��.
				System.out.println("���� ��");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}