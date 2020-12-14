package sec12_Wrapper_����_Ŭ����.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		/*
		 *��ü(object)�� �⺻Ÿ��(int, char ��..)���� ������ �ǰų�,
		 *������ �� ����, ��ü�� �ݵ�� ���۰�ü�� �Ǿ�߸� �ڵ����� unboxing�� �̷�����.
		*/
		 		
		//���Խ� �ڵ� UnBoxing
		//���������δ� ��� ��ü�� �⺻Ÿ�� int�� ���ԵǴ� ���� ���� �ȵ�����,
		//�ڵ� ��ڽ��� �̷����� ������ �����ϴ�.
		int value = obj;
		System.out.println("value: " + value);
		
		//����� �ڵ� UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}