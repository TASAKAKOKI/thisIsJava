package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Blue");
		Member m2 = new Member("Blue");
		Member m3 = new Member("Red");
		
		//���� Object�� equals()�޼ҵ�� �⺻Ÿ���� ��쿡�� ���� ���ϰ�, ����Ÿ���� ��� �����ϰ� �ִ� �ּҰ� ������, ��, ���� ��ü������ ���ϴ� ���ε�,
		//MemberŬ�������� equals()�� ������ ���־��� ������, �ٸ� ��ü�� �����ϰ� �ִ� m1�� m2�� ���� id���� �����Ƿ�, �������� �����ϴٰ� ��µȴ�.
		if(m1.equals(m2)) {
			System.out.println("m1�� m2�� �����մϴ�.");
		} else {
			System.out.println("m1�� m2�� �������� �ʽ��ϴ�.");
		}
		
		if(m1 == m3) {
			System.out.println("m1�� m3�� �����մϴ�.");
		} else {
			System.out.println("m1�� m3�� �������� �ʽ��ϴ�.");
		}
	}
}