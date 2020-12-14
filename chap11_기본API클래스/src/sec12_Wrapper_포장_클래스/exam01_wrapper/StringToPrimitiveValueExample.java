package sec12_Wrapper_포장_클래스.exam01_wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		
		//문자열을 기본 타입 값으로 변환
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true"); 
		System.out.println("val1: " + val1);		
		System.out.println("val2: " + val2);
		System.out.println("val3: " + val3);
		
		System.out.println();
		System.out.println("[...이해를 위한 설명....]");
		
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf(100);
		System.out.println("Integer obj1 = Integer.valueOf(100);\r\nInteger obj2 = Integer.valueOf(100);\r\n를 ==로 비교하면,");
		System.out.println("false가 나오는가?: " + (obj1 == obj2));
		System.out.println();
		
		Integer obj3 = Integer.valueOf(200);
		Integer obj4 = Integer.valueOf(200);
		System.out.println("Integer obj3 = Integer.valueOf(200);\r\nInteger obj4 = Integer.valueOf(200);\r\n를 ==로 비교하면,");
		System.out.println("false가 나와야 한다: " + (obj3 == obj4));
		/*위에서 obj1과 obj2는 서로 다른 객체의 번지를 가리키고 있는데, 
		 *결과는 true를 나타내고 있다.
         *왜냐하면, 포장 객체는 내부의 값 비교하기를 위해 == 와 != 연산자를 사용할 수 없기 때문이다.
        	[예외]
		 *boolean 타입 ==> 		true, false
		 *char 타입 ==> 			\u0000 ~ \u007f
		 *byte, short, int ==>	-128 ~ 127
		 *위와 같은 타입들이 위와 같은 범위의 값을 가질때는 내부의 값을 비교할 수 있다.
		 *따라서, 위의 obj1과 obj2는 각각 int타입으로 자동 언박싱이 되어 같은 내부 값을 가지므로,
		 *번지가 아닌 값비교로 true를 반환한 것이다.
		 *값의 범위를 벗어난 obj3과 obj4의 경우는 번지를 비교하게 되므로, false를 반환한 것을 알 수 있다.
		 *
		 *이처럼 복잡한 문제를 해결하기 위해서는, 값을 언박싱해서 비교하거나, equals()메소드로 내부 값을 비교하는 것이 좋다.
		 * */	
	}
}