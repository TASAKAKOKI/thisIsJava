package sec04.exam01_overriding;

public class ComputerExample {
	
	public ComputerExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("�� ����: " + cal.areaCircle(r) + "\n");

		Computer com = new Computer();
		//�ڽ� Ŭ�������� �����ǵ� �޼ҵ带 �ڽ� ��ü�� ���� ȣ���Ѵ�.
		System.out.println("�� ����: " + com.areaCircle(r) + "\n");
		
	}

}
