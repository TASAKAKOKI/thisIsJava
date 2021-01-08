package verify;

import java.util.Arrays;
import java.util.List;

/*List�� ����Ǿ� �ִ� String��ҿ��� ��ҹ��ڿ� ������� "java"��� �ܾ ���Ե� ���ڿ��� ���͸��ؼ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
 * */
public class exam05 {
	public static void main(String[] arg) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expression",
			"Java8 supports lambdaexpressions"
		);
		
		list.stream()
			//�ڵ��ۼ�
			.filter(s->s.toLowerCase().contains("java")) //���ڿ��� ���� �ҹ��ڷ� ��ȯ�� ��, java��� ���ڿ��� ���Ե� ��Ҹ� ���͸�
			.forEach(System.out::println);
	}
}