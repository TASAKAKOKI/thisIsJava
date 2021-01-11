package sec04_동기화_메소드와_동기화_블록.exam01_unsynchronized;

public class Calculator {
	private int memory;
	
	public int getMemory() {return memory;}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);//스레드를 2초간 일시정지
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}