package sec06_������_����_����.exam06_stop;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start(); //�̴�� �����ϸ�, ���� ���̶�� ���ڿ��� ��� ��µȴ�.
		
		try {
			Thread.sleep(100); //main�����尡 1�ʰ� sleep() ��, �Ͻ����� ���°� �ȴ�. �̶�, printThread�� ������ ���� ���� �����̴�.
		} catch(InterruptedException e) {}
		
		//main�����尡 1�ʰ� �Ͻ����� ���¿��ٰ�, �ٽ� ������ ���°� �Ǿ���, ���� �����尡 ����Ǹ�, printThread�� stop �ʵ带 true�� �ٲ��ֹǷ�, printThread�� stop()�� �ȴ�.
		printThread.setStop(true);
	}
}