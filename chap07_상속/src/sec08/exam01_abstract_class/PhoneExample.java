package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartP = new SmartPhone("���ڹ�");
		//Phone��ü�� �߻�Ŭ�����̹Ƿ�, �����ڸ� ȣ���� �� ����.
		//�߻�Ŭ������ ��ü ������ �ƴ�, �ڽ� ��ü���� ����� ���ؼ��� ���ȴ�.
		//Phone P = new Phone("�����̽�");
		
		smartP.turnOn();
		System.out.println("�� ����Ʈ���� ������ " + smartP.owner + "�Դϴ�."); 
		smartP.internetSearch();
		smartP.turnOff();
	}

}
