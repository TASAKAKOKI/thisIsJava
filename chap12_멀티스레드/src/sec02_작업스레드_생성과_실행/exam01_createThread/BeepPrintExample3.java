package sec02_�۾�������_������_����.exam01_createThread;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//���1_����Ŭ���� ��ü �̿�
		Thread thread1 = new BeepThread();
		thread1.start();
		//���2_Thread �͸�ü ���
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "���� ����: ���ÿ� ��!");
					try{Thread.sleep(700);} catch(Exception e) {}
				}
			}
		};
		thread2.start();
		
		//"��" ���ڿ��� 5�� ����ϴ� �۾��� ����
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "���� ����: ��");
			try {Thread.sleep(700);} catch(Exception e) {}
		}
		
		System.out.println();
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		thread1.setName("������1");
		thread2.setName("������2");
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
	}
}