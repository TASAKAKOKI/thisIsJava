package sec05_제한된타입파라미터.exam01_boundedTypeParameter;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a","b"); //컴파일오류 발생 : 매개값들은 Number타입이 아님
		
		int result1 = Util.compare(10, 20); //int는 Integer로 자동Boxing됨
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); //double은 Double로 자동 Boxing됨
		System.out.println(result2);
		
	}
}