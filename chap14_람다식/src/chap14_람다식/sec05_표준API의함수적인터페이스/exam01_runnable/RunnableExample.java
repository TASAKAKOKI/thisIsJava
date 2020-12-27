package chap14_���ٽ�.sec05_ǥ��API���Լ����������̽�.exam01_runnable;


public class RunnableExample {
	public static void main(String[] args) {
		//���1: Runnable���� ��ü�� �����Ͽ�, ������ ������ ��, �����ڿ� �Ű������� ����
		Runnable runnable = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		
		// ���2: �۾���ü ��ü�� ���ٽ����� �����Ͽ�, �ٷ� ������ �Ű������� ����
		Thread thread2 = new Thread(()-> {
			for(int i =0; i<10; i++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		});
		thread2.start();
		
	}
}