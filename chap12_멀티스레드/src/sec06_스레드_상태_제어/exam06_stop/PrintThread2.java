package sec06_������_����_����.exam06_stop;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		try {
			while(true) { //�߰��� break;�� �Ͼ�� ������ ���ѹݺ� ��.
				System.out.println(Thread.currentThread().getName() + "���� ��");
				Thread.sleep(1);//�̷��� �Ϻη� �Ͻ��������·� ����� ���� ���� �ʴ�.
			}
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + "�ڿ� ����");
		System.out.println(Thread.currentThread().getName() + "���� ����");
	}
}