package sec04_stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"ȫ�浿","�ſ��","���ڹ�","ȫ�浿","�ſ��","���̼�","�Ź�ö");
		/*distinct()
		 *	Stream: equals()�޼ҵ尡 true�� ������ ������ ��ü�� �Ǵ��ϰ� �ߺ��� ����
		 *	IntStream, LongStream, DoubleStream: ���ϰ��� ��� �ߺ��� ����
		 */
		names.stream()
			 .distinct()
			 .forEach(System.out :: println);
		System.out.println();

		/*filter()
		 * 	�Ű������� �־��� Predicate�Լ��� �������̽��� true�� �����ϴ� ��Ҹ� ���͸�
		 */
		names.stream()
			 .filter(n -> n.startsWith("��"))
			 .forEach(System.out::println);
		System.out.println();
		
		/*distinct()�� filter()��� ó��*/
		names.stream()
			 .distinct()
			 .filter(n -> n.startsWith("��"))
			 .forEach(n -> System.out.println(n));
	}
}