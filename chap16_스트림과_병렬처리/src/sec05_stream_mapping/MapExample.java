package sec05_stream_mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		/*mapXXX()메소드
		 * 	요소를 다른 하나의 요소로 대체하여 그 요소들로 구성된 새로운 스트림을 리턴한다.
		 */
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("김자바", 20),
				new Student("파이순", 30)
		); 
		
		studentList.stream()
				   .mapToInt(Student:: getScore)
				   .forEach(System.out:: println);
	}
}