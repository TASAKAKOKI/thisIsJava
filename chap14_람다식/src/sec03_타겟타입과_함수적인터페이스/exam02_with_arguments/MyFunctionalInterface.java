package sec03_타겟타입과_함수적인터페이스.exam02_with_arguments;

@FunctionalInterface 
public interface MyFunctionalInterface {
	public void method(int x); //추상메소드는 매개타입이 int인 매개값 x를 필요로 한다.
}