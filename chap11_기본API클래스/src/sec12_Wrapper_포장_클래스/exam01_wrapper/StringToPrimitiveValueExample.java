package sec12_Wrapper_����_Ŭ����.exam01_wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		
		//���ڿ��� �⺻ Ÿ�� ������ ��ȯ
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true"); 
		System.out.println("val1: " + val1);		
		System.out.println("val2: " + val2);
		System.out.println("val3: " + val3);
		
		System.out.println();
		System.out.println("[...���ظ� ���� ����....]");
		
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf(100);
		System.out.println("Integer obj1 = Integer.valueOf(100);\r\nInteger obj2 = Integer.valueOf(100);\r\n�� ==�� ���ϸ�,");
		System.out.println("false�� �����°�?: " + (obj1 == obj2));
		System.out.println();
		
		Integer obj3 = Integer.valueOf(200);
		Integer obj4 = Integer.valueOf(200);
		System.out.println("Integer obj3 = Integer.valueOf(200);\r\nInteger obj4 = Integer.valueOf(200);\r\n�� ==�� ���ϸ�,");
		System.out.println("false�� ���;� �Ѵ�: " + (obj3 == obj4));
		/*������ obj1�� obj2�� ���� �ٸ� ��ü�� ������ ����Ű�� �ִµ�, 
		 *����� true�� ��Ÿ���� �ִ�.
         *�ֳ��ϸ�, ���� ��ü�� ������ �� ���ϱ⸦ ���� == �� != �����ڸ� ����� �� ���� �����̴�.
        	[����]
		 *boolean Ÿ�� ==> 		true, false
		 *char Ÿ�� ==> 			\u0000 ~ \u007f
		 *byte, short, int ==>	-128 ~ 127
		 *���� ���� Ÿ�Ե��� ���� ���� ������ ���� �������� ������ ���� ���� �� �ִ�.
		 *����, ���� obj1�� obj2�� ���� intŸ������ �ڵ� ��ڽ��� �Ǿ� ���� ���� ���� �����Ƿ�,
		 *������ �ƴ� ���񱳷� true�� ��ȯ�� ���̴�.
		 *���� ������ ��� obj3�� obj4�� ���� ������ ���ϰ� �ǹǷ�, false�� ��ȯ�� ���� �� �� �ִ�.
		 *
		 *��ó�� ������ ������ �ذ��ϱ� ���ؼ���, ���� ��ڽ��ؼ� ���ϰų�, equals()�޼ҵ�� ���� ���� ���ϴ� ���� ����.
		 * */	
	}
}