package verify.exam07;

public class SnowTireExample {
	public static void main(String args[]) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //�ڵ�Ÿ�Ժ�ȯ
		
		snowTire.run();
		tire.run();
	}
}
/*
������:
����� Ÿ�̾ �������ϴ�.
����� Ÿ�̾ �������ϴ�.
*/