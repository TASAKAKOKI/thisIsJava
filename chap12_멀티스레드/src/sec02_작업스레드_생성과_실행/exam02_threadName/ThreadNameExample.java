package sec02_�۾�������_������_����.exam02_threadName;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread1 = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + thread1.getName());
		
		Thread thread2 = new ThreadA();//setName()�����޼ҵ带 ����Ͽ� �������̸��� �����Ͽ���.
		System.out.println(thread2.getName() + "�� ������ ������: " + Thread.currentThread().getName());
		System.out.println("\t�۾� ������ �̸�: " + thread2.getName());
		thread2.start();
		
		Thread thread3 = new ThreadB(); //default���� �������̸����� �����Ǿ� �ִ�.
		System.out.println(thread3.getName() + "�� ������ ������: " + Thread.currentThread().getName());
		System.out.println("\t�۾� ������ �̸�: " + thread3.getName());
		thread3.start();
	}
}