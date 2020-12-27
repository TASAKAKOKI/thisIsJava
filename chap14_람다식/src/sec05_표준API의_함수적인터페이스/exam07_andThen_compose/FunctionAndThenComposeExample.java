package sec05_표준API의_함수적인터페이스.exam07_andThen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		System.out.println("[ .andthen()을 이용하여 메소드를 호출한 객체부터 실행]");
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
		System.out.println();

		System.out.println("[ .compose()을 이용하여 메개값으로 주어진 객체부터 실행]");
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
	}
}