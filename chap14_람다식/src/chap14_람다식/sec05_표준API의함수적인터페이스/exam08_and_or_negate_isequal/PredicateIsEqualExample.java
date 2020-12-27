package chap14_���ٽ�.sec05_ǥ��API���Լ����������̽�.exam08_and_or_negate_isequal;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		//Predicate�� ���� �����ϰ� ���ϴ� ����:
		//�÷��� ��ҿ��� � ���� ã�� �� ���͸� �Ҷ�, ���ڿ��� ���Ե� Ȥ�� ������ ���ڿ��� ã�� ���� �񱳸� ������ ��,
		//�ɷ����� ���� �뵵�� ���
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