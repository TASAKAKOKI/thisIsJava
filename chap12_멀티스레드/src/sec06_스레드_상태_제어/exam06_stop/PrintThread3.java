package sec06_������_����_����.exam06_stop;

public class PrintThread3 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) { //���1
				break;
			}
			if(isInterrupted()) { //���2
				break;
			}
		}		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}