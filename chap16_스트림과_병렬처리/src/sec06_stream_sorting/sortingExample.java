package sec06_stream_sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class sortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,4,1,2,3});
		
		intStream
			.sorted()//정렬
			.forEach(n -> System.out.print(n + ","));
		System.out.println();
	
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 30),
			new Student("파이순", 10),
			new Student("김자바", 20)
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