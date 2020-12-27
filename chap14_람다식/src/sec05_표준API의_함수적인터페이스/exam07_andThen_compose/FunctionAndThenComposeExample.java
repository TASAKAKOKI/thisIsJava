package sec05_ǥ��API��_�Լ����������̽�.exam07_andThen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		System.out.println("[ .andthen()�� �̿��Ͽ� �޼ҵ带 ȣ���� ��ü���� ����]");
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + city);
		System.out.println();

		System.out.println("[ .compose()�� �̿��Ͽ� �ް������� �־��� ��ü���� ����]");
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + city);
	}
}