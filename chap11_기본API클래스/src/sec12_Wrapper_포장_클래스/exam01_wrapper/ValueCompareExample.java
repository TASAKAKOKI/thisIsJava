package sec12_Wrapper_����_Ŭ����.exam01_wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("-128 ~ 127 �ʰ����� ���");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==���: " + (obj1 == obj2));
		System.out.println("������ �ʰ��ϸ�, ��ü������ ���Ѵ�.");
		System.out.println();
		
		System.out.println("-128 ~ 127 ���̰��� ���");
		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println("==���: " + (obj3 == obj4));
		System.out.println("�������� ��ü�� ���� ������, �ϳ��� ��ü�� �����ȴٰ� �����Ͽ�, ���Ѵ�.");
		System.out.println();
		
		System.out.println("[�ذ���1]: ��ڽ� �� �����ֱ�");
		System.out.println("obj1,obj2 ��ڽ��� ==���: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("obj3,obj4 ��ڽ��� ==���: " + (obj3.intValue() == obj4.intValue()));
		System.out.println();

		System.out.println("[�ذ���2]: equals()�޼ҵ� ����ϱ�_ WrapperŬ�������� ������ �Ǿ� ���� ���� ����");
		System.out.println("obj1,obj2 equals()�� �� ���: " + (obj1.equals(obj2)));
		System.out.println("obj3,obj4 equals()�� �� ���: " + (obj3.equals(obj4)));
		
	}
}