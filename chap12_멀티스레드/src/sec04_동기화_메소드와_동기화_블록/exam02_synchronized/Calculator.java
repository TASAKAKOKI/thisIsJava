package sec04_����ȭ_�޼ҵ��_����ȭ_���.exam02_synchronized;

public class Calculator {
	private int memory;
	
	public int getMemory() {return memory;}
	
	public synchronized void setMemory(int memory) { //setMemory()�޼ҵ带 ����ȭ ó�����ش�.
		this.memory = memory;
		try {
			Thread.sleep(2000);//�����带 2�ʰ� �Ͻ�����
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}