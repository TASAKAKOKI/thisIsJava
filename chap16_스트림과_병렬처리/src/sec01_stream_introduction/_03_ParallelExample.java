package sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _03_ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"ȫ�浿","���ڹ�","�ſ��","������","���ٽ�","��Ʈ��"
				);
	
		System.out.println("[���� ó��]");
		Stream<String> stream = list.stream();
		stream.forEach(_03_ParallelExample :: print);  // �޼ҵ� ����14�� ����: s -> _03_ParallelExample.print(s)�� ����

		System.out.println("\n[���� ó��]");
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(_03_ParallelExample :: print);
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}