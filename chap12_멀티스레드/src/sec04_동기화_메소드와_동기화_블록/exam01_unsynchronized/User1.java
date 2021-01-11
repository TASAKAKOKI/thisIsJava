package sec04_동기화_메소드와_동기화_블록.exam01_unsynchronized;

public class User1 extends Thread{
	private Calculator calc;
	
	public void setCalculator(Calculator calc) {
		this.setName("User1");
		this.calc = calc;
	}
	@Override
	public void run() {
		calc.setMemory(100);
	}
}