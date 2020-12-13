package sec06.exam01_class;

public class CarExample {
	public static void main(String[] args) {
		//ObjectŬ������ getClass()�޼ҵ�� �ش�Ŭ������ ��ü�� ������ �ڿ� ��밡���ϴ�.
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println("clazz1�� Ŭ���� ��ü�̸�(��Ű������): 	" + clazz1.getName());
		System.out.println("clazz1�� Ŭ���� �̸�(simple): 	" + clazz1.getSimpleName());
		System.out.println("clazz1�� Ŭ������ ���Ե� ��Ű�� �̸�: 	" + clazz1.getPackage().getName());
		System.out.println();
		
		//forName()�޼ҵ�� ClassŬ������ privateó���� �����ڷ��� ������ �Ұ��� ���� ��ü�ϱ� ����, �����޼ҵ�μ� getClass()�� ���� ������ ������, ��ü������ �ʿ�� ������ �ʴ´�.
		//�ٸ�, �Ű������� �־��� ���ڿ��� �̸����� �ϴ� Ŭ������ ���� ��� ClassNotFoundException�� �߻���Ű�Ƿ�, try-catch���� �ȿ��� ���Ǿ�� �Ѵ�.
		try {
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println("clazz2�� Ŭ���� ��ü�̸�(��Ű������): 	" + clazz2.getName());
			System.out.println("clazz2�� Ŭ���� �̸�(simple): 	" + clazz2.getSimpleName());
			System.out.println("clazz2�� Ŭ������ ���Ե� ��Ű�� �̸�: 	" + clazz2.getPackage().getName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}