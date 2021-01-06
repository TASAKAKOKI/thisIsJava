package sec10_stream_custom_aggregate;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 92),
			new Student("���ڹ�", 100),
			new Student("���̼�", 95),
			new Student("��Ŭ��", 88)
		);
		
		int sum1 = studentList.stream()
							  .mapToInt(Student::getScore)
							  .sum(); //sum()�� �̿�
		
		int sum2 = studentList.stream()
				  .mapToInt(Student::getScore)
				  .reduce((a,b) -> a+b) //reduce(BinaryOperator<Integer>)�� �̿�
				  .getAsInt();
		
		int sum3 = studentList.stream()
				  .mapToInt(Student::getScore)
				  .reduce(0, (a,b) -> a+b); //reduce(BinaryOperator<Integer>)�� �̿�
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}