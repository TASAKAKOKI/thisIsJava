package sec08.exam01_abstract_method_override;

public abstract class Animal {
	//�߻�Ŭ���� Animal���� �߻�޼ҵ� sound()�� ����
	//�̶�, abstractŰ���带 �ٿ��ְ�,
	//�޼ҵ� body{}�� �ۼ���������ä ���д�.
	//������{}�� ��ӹ��� �ڽ�Ŭ�������� ������ �־�� �Ѵ�.
	public abstract void sound();
	
	public String kind;
	
	//�߻�Ŭ������ breathe()�޼ҵ�� ��� �ڽ� ��ü���� ���� �Ǵ� �޼ҵ��
	//�ڽ� ��ü���� �������� ���� �ִ� ���೻��(����)�̶�� �߻�Ŭ�������� �ۼ����ش�.
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
}