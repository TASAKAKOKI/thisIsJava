package sec07_����Ʈ�޼ҵ��_�������̽�Ȯ��.exam01_why_default_method;

public class MyClassB implements MyInterface{
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() ����");
	}
	
	//default�޼ҵ带 ������ �� ����, defaultŰ����� ���� ���ش�.
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() ����");
	}
}
