package sec12_stream_parallelOperation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {
	//요소 처리
	public static void work(int value) {
	}
	
	//병렬처리
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach(a->work(a));
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	
	public static void main(String[] args) {
		//소스컬렉션
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		for(int i=0;i<10000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		
		//워밍업
		long arrayListParallel = testParallel(arrayList);
		long linkedListParallel = testParallel(linkedList);
		
		//병렬 스트림 처리 시간 구하기
		arrayListParallel = testParallel(arrayList);
		linkedListParallel = testParallel(linkedList);
		
		if(arrayListParallel < linkedListParallel) {
			System.out.println("성능 테스트 결과: ArrayList 처리가 더 빠름");
		} else {
			System.out.println("성능 테스트 결과: LinkedList 처리가 더 빠름");
		}
		System.out.println("ArrayList 처리 소요시간: " + arrayListParallel/100000 + "ms");
		System.out.println("LinkedList 처리 소요시간: " + linkedListParallel/100000 + "ms");
		System.out.println("ArrayList 처리 소요시간: " + arrayListParallel + "ns");
		System.out.println("LinkedList 처리 소요시간: " + linkedListParallel + "ns");
	}
}