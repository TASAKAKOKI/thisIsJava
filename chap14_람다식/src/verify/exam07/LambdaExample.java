package verify.exam07;

import java.util.function.Function;
import java.util.function.ToIntFunction;

//exam06�� Ŭ�������� avg()�� ȣ���� ��, �Ű������� �� ���ٽ��� �޼ҵ� ������ �����ϱ�
public class LambdaExample {
	public static Student[] students = {
			new Student("ȫ�浿", 90, 96),
			new Student("���ڹ�", 95, 93)
	};
	
	//avg�޼ҵ� �ۼ�1
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		return sum / students.length;
	}

	/*
	//avg�޼ҵ� �ۼ�2
	public static double avg(Function<Student,Integer> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.apply(student);
		}
		return sum / students.length;
	}
	*/
	
	public static void main(String[] args) {
		double engScoreAvg = avg( Student :: getEngScore );
		System.out.println("���� ��� ����: " + engScoreAvg);
		
		double  mathScoreAvg = avg( Student :: getMathScore );
		System.out.println("���� ��� ����: " + mathScoreAvg);
	}
}