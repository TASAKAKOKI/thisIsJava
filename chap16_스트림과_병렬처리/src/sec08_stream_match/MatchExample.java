package sec08_stream_match;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatchExample {
	public static void main(String[] args) {
		/*matching
		 * ����ó��������� "��ҵ��� Ư�� ������ �����ϴ��� ����
		 *
		 *match�޼ҵ��� ����
		 *	allMatch()
		 *		 ��� ��ҵ��� �Ű������� �־��� Predicate�Լ����������̽��� ������ �����ϴ��� ����
		 *	antMatch()
		 *		�ּ��� �� ���� ��Ұ� �Ű������� �־��� Predicate�Լ����������̽��� ������ �����ϴ��� ����
		 *	noneMatch()
		 *		��� ��ҵ��� �Ű������� �־��� Predicate�Լ����������̽��� ������ �������� �ʴ��� ����
		 */
		int[] intArr = {2,4,6,3,7,};

		boolean result = Arrays.stream(intArr)
							   .allMatch(a->a%2==0);
		System.out.println("��� ��ҵ��� 2�� ����ΰ�? " + result);
		
		result = Arrays.stream(intArr)
				   	   .anyMatch(a->a%3==0);
		System.out.println("�ϳ��� 3�� ����� �ִ°�? " + result);
		
		result = Arrays.stream(intArr)
				   	   .noneMatch(a->a%5==0);
		System.out.println("5�� ����� ���°�? " + result);
	}
}