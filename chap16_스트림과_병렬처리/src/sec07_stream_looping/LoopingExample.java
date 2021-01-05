package sec07_stream_looping;

import java.util.Arrays;

/*����(looping)
 * 	�߰�/���� ó�� ������� ��� ��ü�� �ݺ��ϴ� ���� ���Ѵ�.
 *���θ޼ҵ��� ����
 *	peek()
 *		�߰�ó���޼ҵ�
 *		����ó���޼ҵ尡 ������� ������ ����(lazy)�Ǳ� ������ ����ó���޼ҵ尡 ȣ��Ǿ�߸� �����Ѵ�.
 * 	forEach()
 * 		����ó���޼ҵ�
 */
public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("[peek()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
			  .filter(a->a%2==0)
			  .peek(System.out::println); 
		//����ó���޼ҵ尡 ȣ����� �ʾ����Ƿ�, �������� ����
	
		System.out.println("[����ó���޼ҵ带 �������� ȣ���� ���]");
		int total = Arrays.stream(intArr)
						  .filter(a->a%2==0)
						  .peek(System.out::println)
						  .sum();
		System.out.println("����: " + total);
		//����ó���޼ҵ尡 ȣ��Ǿ����Ƿ�, �����Ѵ�

	}
}