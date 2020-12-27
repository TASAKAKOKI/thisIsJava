package sec05_ǥ��API��_�Լ����������̽�.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", "����", 90),
			new Student("�����", "����", 90),
			new Student("���ѳ�", "����", 95),
			new Student("�ѵ���", "����", 92),
			new Student("���̴�", "����", 88)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0; //���� Ÿ���� ���� �������� �����ϴ� ���, �޸�(,)�� ���� �� ������ �־ �ȴ�.
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
		
	}
	public static void main(String[] args) {
		//�Լ����������̽� Predicate�� ���� ���ٽ��� �Ű������� ����
		double maleAvg = avg(s -> s.getSex().equals("����"));
		System.out.println("���� ��� ����: " + maleAvg);
		
		double femaleAvg = avg(s -> s.getSex().equals("����"));
		System.out.println("���� ��� ����: " + femaleAvg);		
	}
}