package sec08.exam01_abstract_method_override;

public class Dog extends Animal{
	//�θ� ��ü�� Animal�� �⺻ �����ڸ� ���� �����Ƿ�,
	//super()�� �����ص� ��.
	public Dog() {
		this.kind = "������";
	}
	
	//��ӹ��� �߻�Ŭ���� Animal�� �߻�޼ҵ尡 �����Ƿ�,
	//�ݵ�� �ڽİ�ü���� ������ ���־�� �Ѵ�.
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("�۸�!!");
	}
}