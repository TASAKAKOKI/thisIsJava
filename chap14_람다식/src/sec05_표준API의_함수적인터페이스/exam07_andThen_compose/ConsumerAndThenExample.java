package sec05_표준API의_함수적인터페이스.exam07_andThen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> System.out.println("consumerA: " + m.getName());
		Consumer<Member> consumerB = m -> System.out.println("consumerB: " + m.getId());
		
		/*andThen()는 메소드를 호출한 객체를 먼저 실행하고, 매개값으로 주어진 객체를 나중에 실행한다.*/
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
		System.out.println();
		
		Consumer<Member> consumerBA = consumerB.andThen(consumerA);
		consumerBA.accept(new Member("홍길동", "hong", null));
	}
}