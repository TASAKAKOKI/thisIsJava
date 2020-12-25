package chap14_람다식.sec04_클래스멤버와로컬변수사용.exam02_local_variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// 아래의 초기화는 모두 final특성으로 에러발생
		// arg = 20;
		// localVar = 20;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar); //람다식 내에서 로컬변수 localVAR와 매개변서 arg가 사용되었으므로, 이 둘은 final 특성을 갖게 되어 변경이 불가해진다.
		};
		fi.method();
	}
}