package sec01_stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _03_ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"홍길동","김자바","신용권","신춘향","람다식","스트림"
				);
	
		System.out.println("[순차 처리]");
		Stream<String> stream = list.stream();
		stream.forEach(_03_ParallelExample :: print);  // 메소드 참조14장 참고: s -> _03_ParallelExample.print(s)와 동일

		System.out.println("\n[병렬 처리]");
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(_03_ParallelExample :: print);
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}