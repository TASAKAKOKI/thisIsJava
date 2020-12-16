package verify.exam11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		/*
		 * 숫자 100과 300으로 각각 박싱된 Integer 객체를 == 연산자로 비교할 떄,
		 * 100을 박싱한 객체들은 true가 나오는데,
		 * 300을 박싱한 객체들은 false가 나오는 이유는 무엇인가?
		 * */
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		/*Integer박싱은 -128~127사이값으로 객체를 생성하여 박싱한 경우에는 그 값을 비교하지만,
		 *초과값을 박싱한 경우에는 객체번지를 비교하므로, false가 나오는 것이다.
		 *이를 위해서는, obj.intValue()를 사용하면, 값만 비교할 수 있다.
		*/
		System.out.println(obj1 == obj2);
		System.out.println(obj3.intValue() == obj4.intValue());
		
	}
}