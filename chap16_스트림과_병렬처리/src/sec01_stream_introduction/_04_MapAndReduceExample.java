package sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;

public class _04_MapAndReduceExample {
	public static void main(String[] args) {
		List<_02_Student> list = Arrays.asList(
				new _02_Student("ȫ�浿",10),
				new _02_Student("��Ʈ��",20),
				new _02_Student("���ڹ�",30)
				);
		double avg = list.stream() //original��Ʈ���� ����
				.mapToInt(_02_Student :: getScore) // �л���ü�� ���� �������� ��Ʈ���� ����(int)�� ��ҷ� ���� ��Ʈ������ (����)
				.average() //��հ��� ����. OptionalDouble�� ��ȯ�ϹǷ�, 
				.getAsDouble(); // double�� ��ȯ���ش�.
		System.out.println("��� ����: " + avg);
	}
}