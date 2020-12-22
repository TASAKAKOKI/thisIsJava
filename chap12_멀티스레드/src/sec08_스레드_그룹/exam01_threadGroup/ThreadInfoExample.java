package sec08_스레드_그룹.exam01_threadGroup;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("실행 중인 Thread의 이름: " + thread.getName().toString() + ((thread.isDaemon())?"(데몬)":"(주)"));
			System.out.println("\t소속 스레드 그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}	
}