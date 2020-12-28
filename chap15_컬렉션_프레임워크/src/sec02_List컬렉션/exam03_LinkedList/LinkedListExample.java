package sec02_List컬렉션.exam03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		var list2 = new LinkedList<String>(); //java10 에서 새롭게 추가된 var 키워드를 사용하였다. 반복되는 <>()코드를 줄여주는 효과
		
		long startTime;
		long endTime;
		
		/*ArrayList와 LinkedList를 이용하여 for문을 실행하여, list의 맨 앞에 요소를 추가하는 작업을 하여 수행시간을 비교해보기 */		
			//ArrayList의 소요시간
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list1.add(0,String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("ArrayList가 걸린 시간: \t" + (endTime - startTime) + "ns");
			
			//LinkedList의 소요 시간
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list2.add(0,String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("LinkedList가 걸린 시간: \t" + (endTime - startTime) + "ns");
		
		/*ArrayList와 LinkedList를 이용하여 for문을 실행하여, list의 맨 뒤에 요소를 추가하는 작업을 하여 수행시간을 비교해보기 */		
			//ArrayList의 소요시간
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list1.add(String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("ArrayList가 걸린 시간: \t" + (endTime - startTime) + "ns");
			
			//LinkedList의 소요 시간
			startTime = System.nanoTime();
			for(int i = 0; i < 100000; i++) {
				list2.add(String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("LinkedList가 걸린 시간: \t" + (endTime - startTime) + "ns");
	}
}