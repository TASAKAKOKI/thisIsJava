package sec03.exam01_parent_constructor_call;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		//�ڽ� Ŭ������ �����ڿ����� ���� ���� �θ� Ŭ������ ������(super(�Ű���...))�� �Ű�����Ÿ�԰� �Ű����� ����� ���� ȣ���ؾ� �Ѵ�.
		super(name, ssn);
		// TODO Auto-generated constructor stub
		this.studentNo = studentNo;
		System.out.println("�ڽ� ��ü ���� �Ϸ�");
	}
}
