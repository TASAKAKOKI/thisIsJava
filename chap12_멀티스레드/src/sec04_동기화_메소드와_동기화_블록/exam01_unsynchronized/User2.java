package sec04_����ȭ_�޼ҵ��_����ȭ_���.exam01_unsynchronized;

public class User2 extends Thread{
	private Calculator calc;
	
	public void setCalculator(Calculator calc) {
		this.setName("User2");
		this.calc = calc;
	}
	@Override
	public void run() {
		calc.setMemory(50);
	}
}