package sec01_stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class _01_IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","���ڹ�","���̽�","�𺧷���");
		
		System.out.println("[Iterator �̿�]");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("\n[Stream �̿�]");		
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name)); //stream.forEach()�޼ҵ�� (Consumer<? super T> action )�� �Ű������� �޴´�.
		//Consumer�� �Ű����� �Һ��ϴ� �Լ��� �������̽��̴�.
	}
}