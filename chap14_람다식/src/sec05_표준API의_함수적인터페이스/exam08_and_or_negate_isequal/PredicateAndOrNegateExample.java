package sec05_ǥ��API��_�Լ����������̽�.exam08_and_or_negate_isequal;

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
		System.out.println("9�� 2�� 3�� ����Դϱ�?: " + result);
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2 �Ǵ� 3�� ����Դϱ�?: " + result);
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ�� �Դϱ�?(2�� ����� �ƴմϱ�?): " + result);
	}
}