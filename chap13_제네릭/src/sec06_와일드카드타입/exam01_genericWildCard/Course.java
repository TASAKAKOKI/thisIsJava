package sec06_���ϵ�ī��Ÿ��.exam01_genericWildCard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);//���� TŸ���� �������� ���� ���¿��� �迭�� ũ�⸦ ���ϰ�, �迭��ü�� ������ �� ����: new T[capacity] ������ �Ұ���
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}

	public void add(T t) {
		for(int i =0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}