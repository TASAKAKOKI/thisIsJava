package sec08_������_�׷�.exam01_threadGroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup threadGroup = new ThreadGroup("myGroup"); //myGroup�̶�� ������ �׷��� ����
		WorkThread workThreadA = new WorkThread(threadGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(threadGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();

		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��� ���� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
	}
}