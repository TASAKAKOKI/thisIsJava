package sec08.exam01_abstract_class;

//�߻�Ŭ���� Phone�� ����� SmartPhone Ŭ���� ����
public class SmartPhone extends Phone{
	//�߻�Ŭ������ ��ӹ޾����Ƿ�,
	//�θ� Ŭ������ Phone�� �����ڸ� ȣ���Ͽ� �θ� ��ü�� �����Ͽ��� �Ѵ�.
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}
