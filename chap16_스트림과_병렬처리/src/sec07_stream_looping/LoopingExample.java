package sec07_stream_looping;

import java.util.Arrays;

/*루핑(looping)
 * 	중간/최종 처리 기능으로 요소 전체를 반복하는 것을 말한다.
 *루핑메소드의 종류
 *	peek()
 *		중간처리메소드
 *		최종처리메소드가 실행되지 않으면 지연(lazy)되기 때문에 최종처리메소드가 호출되어야만 동작한다.
 * 	forEach()
 * 		최종처리메소드
 */
public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			  .filter(a->a%2==0)
			  .peek(System.out::println); 
		//최종처리메소드가 호출되지 않았으므로, 동작하지 않음
	
		System.out.println("[최종처리메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)
						  .filter(a->a%2==0)
						  .peek(System.out::println)
						  .sum();
		System.out.println("총합: " + total);
		//최종처리메소드가 호출되었으므로, 동작한다

	}
}