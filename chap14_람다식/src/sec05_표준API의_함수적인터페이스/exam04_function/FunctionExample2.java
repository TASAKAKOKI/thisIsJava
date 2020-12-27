package sec05_ǥ��API��_�Լ����������̽�.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿",93, 95),
			new Student("�ſ��", 96, 90)
			);
			
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double engAvg = avg(s -> s.getengScore());
		System.out.println("���� ��� ����: " + engAvg);
		
		double mathAvg = avg(s -> s.getmathScore());
		System.out.println("���� ��� ����: " + mathAvg);
	}
}