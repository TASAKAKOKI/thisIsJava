package sec03_������_�켱_����;

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
		System.out.println(getName() + "�� ����� �����Ͽ����ϴ�.");
	}
}
