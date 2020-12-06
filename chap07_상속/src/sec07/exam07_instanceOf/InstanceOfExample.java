package sec07.exam07_instanceOf;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ ����");
		}
	}
	//method2�� instanceȮ���� ������ �ʱ� ������ ClassCastException ���ܰ� �߻��� ���ɼ��� �ִ�.
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		//�Ʒ��� �� �޼ҵ忡���� ��� Child��ü�� �Ű������� �����ϰ� �����Ƿ�, ������ �߻����� �ʴ´�.
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		//�Ʒ��� �� �޼ҵ忡���� ��� Parent��ü�� �Ű������� �����ϰ� �ִ�.
		//����, instance�˻縦 �ϴ� method1������ ������ �߻����� ������,
		//instance �˻縦 ���� �ʴ� method2������ ClassCastException ���ܰ� �߻��Ѵ�.
		method1(parentB);
		method2(parentB);//���ܹ߻�!!
	}

}
