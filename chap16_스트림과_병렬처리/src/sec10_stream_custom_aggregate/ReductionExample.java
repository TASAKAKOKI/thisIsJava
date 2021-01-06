package sec10_stream_custom_aggregate;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 92),
			new Student("김자바", 100),
			new Student("파이순", 95),
			new Student("이클립", 88)
		);
		
		int sum1 = studentList.stream()
							  .mapToInt(Student::getScore)
							  .sum(); //sum()을 이용
		
		int sum2 = studentList.stream()
				  .mapToInt(Student::getScore)
				  .reduce((a,b) -> a+b) //reduce(BinaryOperator<Integer>)을 이용
				  .getAsInt();
		
		int sum3 = studentList.stream()
				  .mapToInt(Student::getScore)
				  .reduce(0, (a,b) -> a+b); //reduce(BinaryOperator<Integer>)을 이용
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
}