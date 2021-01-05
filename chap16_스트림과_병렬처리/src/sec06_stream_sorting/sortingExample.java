package sec06_stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class sortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,4,1,2,3});
		
		intStream
			.sorted()//����
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
	
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 30),
			new Student("���̼�", 10),
			new Student("���ڹ�", 20)
		);
		
		studentList.stream()
				   .sorted()
				   .forEach(s -> System.out.print(s.getName() + ":" + s.getScore() + ","));
		System.out.println();
	
		studentList.stream()
				   .sorted(Comparator.reverseOrder())
				   .forEach(s -> System.out.print(s.getName() + ":" + s.getScore() + ","));
	}
}