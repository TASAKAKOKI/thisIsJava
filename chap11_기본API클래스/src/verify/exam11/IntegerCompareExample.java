package verify.exam11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		/*
		 * ���� 100�� 300���� ���� �ڽ̵� Integer ��ü�� == �����ڷ� ���� ��,
		 * 100�� �ڽ��� ��ü���� true�� �����µ�,
		 * 300�� �ڽ��� ��ü���� false�� ������ ������ �����ΰ�?
		 * */
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		/*Integer�ڽ��� -128~127���̰����� ��ü�� �����Ͽ� �ڽ��� ��쿡�� �� ���� ��������,
		 *�ʰ����� �ڽ��� ��쿡�� ��ü������ ���ϹǷ�, false�� ������ ���̴�.
		 *�̸� ���ؼ���, obj.intValue()�� ����ϸ�, ���� ���� �� �ִ�.
		*/
		System.out.println(obj1 == obj2);
		System.out.println(obj3.intValue() == obj4.intValue());
		
	}
}