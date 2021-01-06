package sec09_stream_aggregate;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5�� ��Ʈ�迭�� ��Ʈ��Ʈ������ ����
						  .filter(n->n%2==0) //2�� ��������� �̷��� intStream���� (�߰�ó��)
						  .count(); //2�� ��������� �̷��� intStream�� ��� ���� ī����
		System.out.println("2�� ����� ����: " + count);
	
		long sum = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5�� ��Ʈ�迭�� ��Ʈ��Ʈ������ ����
					     .filter(n->n%2==0) //2�� ��������� �̷��� intStream���� (�߰�ó��)
					     .sum(); //2�ǹ�������� �̷��� intStream�� ��ҵ��� ���� ��ȯ
		System.out.println("2�� ����� ��: " + sum);		

		int max = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5�� ��Ʈ�迭�� ��Ʈ��Ʈ������ ����
					    .filter(n->n%2==0) //2�� ��������� �̷��� intStream���� (�߰�ó��)
					    .max() //2�� ��������� �̷��� intStream�� ���� ū ���� ��ȯ (OptionalIntŸ��)
					    .getAsInt(); //OptionaInt���� intŸ���� ��
		System.out.println("2�� ��� �� �ִ밪: " + max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5}) //1,2,3,4,5�� ��Ʈ�迭�� ��Ʈ��Ʈ������ ����
					    .filter(n->n%2==0) //2�� ��������� �̷��� intStream���� (�߰�ó��)
					    .min() //2�� ��������� �̷��� intStream�� ���� ���� ���� ��ȯ (OptionalIntŸ��)
					    .getAsInt(); //OptionaInt���� intŸ���� ��
		System.out.println("2�� ��� �� �ִ밪: " + min);
		
		int first3 = Arrays.stream(new int[] {1,2,6,4,5,3}) //1,2,3,4,5�� ��Ʈ�迭�� ��Ʈ��Ʈ������ ����
						   .filter(n->n%3==0) //3�� ��������� �̷��� intStream���� (�߰�ó��)
						   .findFirst() //3�� ��������� �̷��� intStream�� ���� ù��° 3�� ����� ��ȯ (OptionalIntŸ��)
						   .getAsInt(); //OptionaInt���� intŸ���� ��
		System.out.println("ù��° 3�� ���: " + first3);
		
	}
}