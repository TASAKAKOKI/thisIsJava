package sec03.exam02_access_from_nestedclass_to_outter_field_and_method;

public class A {
	//�ν���Ʈ �ʵ� �� �޼ҵ�
	int field1;
	void method1() {}
	
	//���� �ʵ� �� �޼ҵ�
	static int field2;
	static void method2() {}
	
	//�ν��Ͻ� ��� Ŭ����
	class B {
		void method() {
			/*�ν��Ͻ� ��� Ŭ���� ���ο����� �ܺ� Ŭ������ �ν��Ͻ� �� ���� �ʵ�/�޼ҵ� ��ο� ������ �� �ִ�.*/
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//���� ��� Ŭ����
	static class C {
		void method() {
			/*���� ��� Ŭ���� ���ο����� �ܺ� Ŭ������ ���� �ʵ� �� ���� �޼ҵ忡�� ������ �� �ִ�.*/
			field1 = 10; 	//(x)
			method1();		//(x)
			
			field2 = 10;
			method2();
		}
	}
}