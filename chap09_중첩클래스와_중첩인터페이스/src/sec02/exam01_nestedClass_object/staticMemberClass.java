package sec02.exam01_nestedClass_object;

public class staticMemberClass {
	/*���� ��� Ŭ����*/
	/*��� ������ �ʵ�, �޼ҵ带 ������ �� �ִ�.*/
	static class C {
		C() {} 					// ������
		int field1; 			//�ν��Ͻ� �ʵ�
		static int field2; 		//���� �ʵ�
		void method1() {} 		//�ν��Ͻ� �޼ҵ�
		static void method2() {} //���� �޼ҵ�
	}
}