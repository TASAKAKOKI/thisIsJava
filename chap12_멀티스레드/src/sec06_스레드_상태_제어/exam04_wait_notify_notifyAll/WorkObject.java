package sec06_������_����_����.exam04_wait_notify_notifyAll;

public class WorkObject {
	public synchronized void methodA() { //wait()�� notify()�޼ҵ带 ȣ���Ϸ���, �ش� ����̳� �޼ҵ带 ����ȭ ó�� ���־�� �Ѵ�.
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify(); //���� �Ͻ����� ���� �����带 ������ ���·� ������ش�.
		try {
			wait();
		} catch (InterruptedException e) {} //�ڱ� �ڽ�(���� methodA�� ȣ���� ������)�� �Ͻ����� ���·� ������ش�.
	}
	
	public synchronized void methodB() { //wait()�� notify()�޼ҵ带 ȣ���Ϸ���, �ش� ����̳� �޼ҵ带 ����ȭ ó�� ���־�� �Ѵ�.
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify(); //���� �Ͻ����� ���� �����带 ������ ���·� ������ش�.
		try {
			wait();
		} catch (InterruptedException e) {} //�ڱ� �ڽ�(���� methodB�� ȣ���� ������)�� �Ͻ����� ���·� ������ش�.
	}
}