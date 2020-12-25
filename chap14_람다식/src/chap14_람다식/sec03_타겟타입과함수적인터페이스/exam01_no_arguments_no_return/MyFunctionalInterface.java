package chap14_람다식.sec03_타겟타입과함수적인터페이스.exam01_no_arguments_no_return;

//컴파일러가 해당 인터페이스가 추상메소드 1개만 갖는지 체크하도록 하는 구문
@FunctionalInterface 
public interface MyFunctionalInterface {
	public void method();
	//public void method2(); //추상 메소드를 하나 더 추가하려고 하면, @FunctionalInterface어노테이션에 의해 오류가 발생할 것을 알린다.
}