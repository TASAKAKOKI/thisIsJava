package sec05_stream_mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		/*mapXXX()�޼ҵ�
		 * 	��Ҹ� �ٸ� �ϳ��� ��ҷ� ��ü�Ͽ� �� ��ҵ�� ������ ���ο� ��Ʈ���� �����Ѵ�.
		 */
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("���ڹ�", 20),
				new Student("���̼�", 30)
		); 
		
		studentList.stream()
				   .mapToInt(Student:: getScore)
				   .forEach(System.out:: println);
	}
}