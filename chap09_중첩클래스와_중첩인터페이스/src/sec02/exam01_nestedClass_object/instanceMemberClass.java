package sec02.exam01_nestedClass_object;

public class instanceMemberClass {
	/*�ν��Ͻ� ��� Ŭ����*/
	/*�ܺ� Ŭ������ �����Ǿ�߸� ��� �����ϸ�, static�� ���� �� ����.*/
	void method() {
		class B {
			B() {} 					// ������
			int field1; 			//�ν��Ͻ� �ʵ�
			//static int field2; 		//���� �ʵ�
			void method1() {} 		//�ν��Ͻ� �޼ҵ�
			//static void method2() {} //���� �޼ҵ�
		}
	}
}