package sec08_스레드_그룹.exam01_threadGroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup threadGroup = new ThreadGroup("myGroup"); //myGroup이라는 스레드 그룹을 생성
		WorkThread workThreadA = new WorkThread(threadGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(threadGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();

		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
	}
}