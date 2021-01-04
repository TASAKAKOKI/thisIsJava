package sec02_stream_kind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("È«±æµ¿", 10),
			new Student("½Å¿ë±Ç", 20),
			new Student("±èÀÚ¹Ù", 30)
		);
		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s-> System.out.println(s.getName()));
	}
}