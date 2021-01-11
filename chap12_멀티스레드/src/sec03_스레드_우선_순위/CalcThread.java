package sec03_스레드_우선_순위;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for(int j=0; j<3; j++) {
			for(long i=0; i<1000000000; i++) {
			}
		}
		System.out.println(getName() + "가 계산을 종료하였습니다.");
	}
}
