package sec06_������_����_����.exam06_stop;

public class PrintThread1 extends Thread{
	private boolean stop; //stop �÷��� �ʵ�
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) { //stop�� true�� �Ǹ� run()�� ����ȴ�.
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}