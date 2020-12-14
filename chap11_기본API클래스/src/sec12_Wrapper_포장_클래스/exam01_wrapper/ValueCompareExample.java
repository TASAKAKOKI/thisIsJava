package sec12_Wrapper_포장_클래스.exam01_wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("-128 ~ 127 초과값일 경우");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("범위를 초과하면, 객체번지를 비교한다.");
		System.out.println();
		
		System.out.println("-128 ~ 127 사이값일 경우");
		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("범위안의 객체는 값이 같으면, 하나의 객체만 생성된다고 가정하여, 비교한다.");
		System.out.println();
		
		System.out.println("[해결방안1]: 언박싱 후 비교해주기");
		System.out.println("obj1,obj2 언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("obj3,obj4 언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println();

		System.out.println("[해결방안2]: equals()메소드 사용하기_ Wrapper클래스에서 재정의 되어 내부 값을 비교함");
		System.out.println("obj1,obj2 equals()로 비교 결과: " + (obj1.equals(obj2)));
		System.out.println("obj3,obj4 equals()로 비교 결과: " + (obj3.equals(obj4)));
		
	}
}