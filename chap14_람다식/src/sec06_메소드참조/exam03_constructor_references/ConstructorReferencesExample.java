package sec06_�޼ҵ�����.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel"); //�Ű����� �ϳ��� ���޵Ǿ����Ƿ�, ���ڿ��� �ϳ��� �޴� �����ڰ� ȣ��ȴ�.
		
		BiFunction<String,String, Member> function2 = Member :: new;
		Member member2 = function2.apply("Newõ��", "angel"); //�Ű����� �ΰ� ���޵Ǿ����Ƿ�, ���ڿ��� �ΰ��� �޴� �����ڰ� ȣ��ȴ�.
	}
}