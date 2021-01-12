package sec06_스레드_상태_제어.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}