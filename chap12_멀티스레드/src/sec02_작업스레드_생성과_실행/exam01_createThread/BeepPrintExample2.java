package sec02_�۾�������_������_����.exam01_createThread;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//��������  5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾��� ����

		//���1_Runnable ���� ��ü ����
		Runnable beepTask = new BeepTask();
		Thread thread1 = new Thread(beepTask);
		thread1.start();
		
		//���2_Runnabel �͸�ü�� �Ű������� ����
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("���ÿ� ��");
					try{Thread.sleep(600);} catch(Exception e) {}
				}
			}
		});
		thread2.start();
		
		//���3_�Լ����������̽���� ���� �̿��Ͽ�, ���ٽ����� ������ ����
		Thread thread3 = new Thread( () -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("���� ���ÿ� �۾�����");
				try {Thread.sleep(600);} catch(Exception e) {}
			}
		});
		thread3.start();
	}
}