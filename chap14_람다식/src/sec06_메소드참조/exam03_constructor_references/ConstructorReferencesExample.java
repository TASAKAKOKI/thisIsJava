package sec06_메소드참조.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel"); //매개값이 하나만 전달되었으므로, 문자열을 하나만 받는 생성자가 호출된다.
		
		BiFunction<String,String, Member> function2 = Member :: new;
		Member member2 = function2.apply("New천사", "angel"); //매개값이 두개 전달되었으므로, 문자열을 두개를 받는 생성자가 호출된다.
	}
}