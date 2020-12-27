package sec05_ǥ��API��_�Լ����������̽�.exam07_andThen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> System.out.println("consumerA: " + m.getName());
		Consumer<Member> consumerB = m -> System.out.println("consumerB: " + m.getId());
		
		/*andThen()�� �޼ҵ带 ȣ���� ��ü�� ���� �����ϰ�, �Ű������� �־��� ��ü�� ���߿� �����Ѵ�.*/
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "hong", null));
		System.out.println();
		
		Consumer<Member> consumerBA = consumerB.andThen(consumerA);
		consumerBA.accept(new Member("ȫ�浿", "hong", null));
	}
}