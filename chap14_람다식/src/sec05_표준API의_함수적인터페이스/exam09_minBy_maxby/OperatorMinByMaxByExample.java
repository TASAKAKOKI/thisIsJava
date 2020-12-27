package sec05_표준API의_함수적인터페이스.exam09_minBy_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		//minBy()와 maxBy()메소드는 BinaryOperator<T>인터페이스의 정적 메소드이다.
		
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		//Comparator<T>는 o1과 o2를 비교해서, o1이 작으면 음수, 같으면 0, o1이 크면 양수를 리턴해야하는 compare()메소드가 정의되어 있는 함수적인터페이스이다.
		/*
		 * @FunctionalInterface
		 * public interface Comparator<T> {
		 * 		public int compare(T o1, T o2);
		 * */
		//만약 o1,o2가 int 타입이라면, Integer.compare(o1,o2)를 사용해도 된다.		
		binaryOperator = BinaryOperator.minBy( (f1, f2) -> Integer.compare(f1.price, f2.price) );
		fruit = binaryOperator.apply( new Fruit("오렌지", 5000), new Fruit("사과", 6900) );
		System.out.println("싼 과일: " + fruit.name + " = " + fruit.price + "원");
		
		binaryOperator = BinaryOperator.maxBy( (f1, f2) -> Integer.compare(f1.price, f2.price) );
		fruit = binaryOperator.apply( new Fruit("오렌지", 5000), new Fruit("사과", 6900) );
		System.out.println("비싼 과일: " + fruit.name + " = " + fruit.price + "원");
	}
}