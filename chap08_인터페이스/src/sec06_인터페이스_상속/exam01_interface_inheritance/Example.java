package sec06_�������̽�_���.exam01_interface_inheritance;

public class Example {
	public static void main(String args[]) {
		ImplementationC impl = new ImplementationC();
		
		System.out.println("===��ӹ��� ���� �������̽�A Ÿ������ ��ȯ");
		System.out.println("===�������̽�A�� �޼ҵ常 ȣ�� ����");
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();

		System.out.println("===��ӹ��� ���� �������̽�B Ÿ������ ��ȯ");
		System.out.println("===�������̽�B�� �޼ҵ常 ȣ�� ����");		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		System.out.println("===������ �������̽�C Ÿ������ ��ȯ");
		System.out.println("===�������̽�C�� �޼ҵ� �� ��ӹ��� ���� �������̽��� �޼ҵ������ ȣ�� ����");		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
