package sec06_������_����_����.exam06_stop;

public class PrintThread3 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + "���� ��");
			//�Ʒ��� ����� ó��, �����޼ҵ�interrupted() �Ǵ� �ν��Ͻ� �޼ҵ� isInterrupted()�޼ҵ带 ���� �Ͻ������� ó���ϴ� ���� ����.
			if(Thread.interrupted()) { //���1
				break;
			}
			if(isInterrupted()) { //���2
				break;
			}
		}		
		System.out.println(Thread.currentThread().getName() + "�ڿ� ����");
		System.out.println(Thread.currentThread().getName() + "���� ����");
	}
}