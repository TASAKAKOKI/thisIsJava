package sec06_�������̽�_���.exam01_interface_inheritance;

public class ImplementationC implements InterfaceC {
	//���� �������̽� InterfaceC�� ������ �� ��ü���� InterfaceC�� �߻�޼ҵ忡 ���� ��ü�޼ҵ� �Ӹ� �ƴ϶�, 
	//InterfaceC�� ���� �������̽��� InterfaceA�� InterfaceB�� �߻�޼ҵ忡 ���� ��ü�޼ҵ嵵 �־�� �Ѵ�.
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");
	}	
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");		
	}	
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}
}
