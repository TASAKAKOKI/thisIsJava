package sec09_stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*���� �ڵ�� NotSuchElementExeception ���ܰ� �߻��Ѵ�.
		double avg = list.stream()
						 .mapToInt(Integer :: intValue)
						 .average()
						 .getAsDouble();
		��Ʈ���� ������ ��ҵ��� �������� �ʱ� �����̴�.
		*/
		
		OptionalDouble optional = list.stream()
									  .mapToInt(Integer::intValue)
									  .average();
		if(optional.isPresent()) {
			System.out.println("���1_���: " + optional.getAsDouble());
		} else {
			System.out.println("���1_default���: " + 0.0);
		}
		
		double avg = list.stream()
						 .mapToInt(Integer::intValue)
						 .average()
						 .orElse(0.0); //.average()���� Exception�� �߻��ϸ�, 0.0�� ��ȯ, �׷��� ���� ��� �������� double���� ��ȯ
		System.out.println("���2_���: " + avg);
		
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a->System.out.println("���3-1_���: " + a)); //���� �ִ� ��쿡�� ����(������� ����)
		
		list.add(3);
		list.add(8);
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(a->System.out.println("���3-2_���: " + a)); //���� �ִ� ��쿡�� ����(�����)
	}
}