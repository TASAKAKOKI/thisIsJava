package sec05_제한된타입파라미터.exam01_boundedTypeParameter;

public class Util {
	/*Util 클래스는 compare()라고 하는 정적 메소드를 갖는데,
	 * 이 메소드는 정적(static)메소드이고,
	 * Number타입 혹은 하위 타입의 구현클래스 타입으로 제한된 파라미터 타입을 가지며,
	 * 매개값으로는 Number타입 혹은 하위 타입의 구현클래스 타입이 두개 주어지며,
	 * 리턴값으로는 int를 반환하는 메소드이다.*/
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();//Number.doubleValue(): returns the value of the specified number as a double
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}