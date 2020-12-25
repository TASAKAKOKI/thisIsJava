package chap14_람다식.sec03_타겟타입과함수적인터페이스.exam03_with_return;

@FunctionalInterface 
public interface MyFunctionalInterface {
	public int method(int x, int y); //추상메소드는 매개타입이 int인 결과를 반환하며, 매개값으로 int타입 x와 y를 필요로 한다.
}