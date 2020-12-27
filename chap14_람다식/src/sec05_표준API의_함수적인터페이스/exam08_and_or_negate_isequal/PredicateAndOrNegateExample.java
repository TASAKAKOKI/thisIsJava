package sec05_표준API의_함수적인터페이스.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		IntPredicate predicateA;
		IntPredicate predicateB;
		IntPredicate predicateAB;
		boolean result;
		
		predicateA = i -> i%2 == 0;
		predicateB = i -> i%3 == 0;
		
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까?: " + result);
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까?: " + result);
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수 입니까?(2의 배수가 아닙니까?): " + result);
	}
}