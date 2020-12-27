package chap14_람다식.sec05_표준API의함수적인터페이스.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		//Predicate를 만들어서 복잡하게 비교하는 이유:
		//컬렉션 요소에서 어떤 값을 찾는 등 필터링 할때, 문자열이 포함된 혹은 동일한 문자열을 찾기 위해 비교를 수행할 시,
		//걸러내기 위한 용도로 사용
		predicate = Predicate.isEqual(null);
		System.out.println("null - null: " + predicate.test(null));
		
		predicate = Predicate.isEqual("Java 8");
		System.out.println("Java 8 - null: " + predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("null - Java 8: " + predicate.test("Java 8"));
		
		predicate = Predicate.isEqual("Java 8");
		System.out.println("Java 8 - Java 8: " + predicate.test("Java 8"));
		
		predicate = Predicate.isEqual("Java 8");
		System.out.println("Java8 - java 8: " + predicate.test("java 8"));
		
	}
}