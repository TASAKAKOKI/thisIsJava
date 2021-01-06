package sec08_stream_match;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatchExample {
	public static void main(String[] args) {
		/*matching
		 * 최종처리기능으로 "요소들이 특정 조건을 만족하는지 조사
		 *
		 *match메소드의 종류
		 *	allMatch()
		 *		 모든 요소들이 매개값으로 주어진 Predicate함수적인터페이스의 조건을 만족하는지 조사
		 *	antMatch()
		 *		최소한 한 개의 요소가 매개값으로 주어진 Predicate함수적인터페이스의 조건을 만족하는지 조사
		 *	noneMatch()
		 *		모든 요소들이 매개값으로 주어진 Predicate함수적인터페이스의 조건을 만족하지 않는지 조사
		 */
		int[] intArr = {2,4,6,3,7,};

		boolean result = Arrays.stream(intArr)
							   .allMatch(a->a%2==0);
		System.out.println("모든 요소들이 2의 배수인가? " + result);
		
		result = Arrays.stream(intArr)
				   	   .anyMatch(a->a%3==0);
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr)
				   	   .noneMatch(a->a%5==0);
		System.out.println("5의 배수가 없는가? " + result);
	}
}