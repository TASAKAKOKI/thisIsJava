package sec02.exam01_nestedClass_object;

public class localClass {
	/*���� Ŭ����*/
	/*����������(public,default) �� static�� ���� �� ����.*/
	/*�޼ҵ� ���ο����� ��밡���ϸ�, �ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ常 ���� ����*/
	void method() {
		class D {
			D() {} 					// ������
			int field1; 			//�ν��Ͻ� �ʵ�
			//static int field2; 		//���� �ʵ�
			void method1() {} 		//�ν��Ͻ� �޼ҵ�
			//static void method2() {} //���� �޼ҵ�
		}
		/*���� Ŭ������ �޼ҵ� �ȿ����� ���ȴ�.
		���� �ٱ� Ŭ���� ��ü ����, Ŭ������ ���� ���� ���� �ʿ����, ���������ڵ� �ʿ����.*/
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}