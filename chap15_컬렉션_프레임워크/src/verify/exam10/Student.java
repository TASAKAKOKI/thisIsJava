package verify.exam10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student s) {
		if(s.score == score) return 0;
		else if(s.score > score) return -1; //��ü �ڽ��� score�� �񱳴���� score���� ������ ����
		else return 1; // ��ü �ڽ��� score�� �񱳴���� score���� ũ�� ���
	}
}