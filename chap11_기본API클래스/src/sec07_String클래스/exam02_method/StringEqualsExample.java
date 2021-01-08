package sec07_String클래스.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("김자바"); //new는 새로운 객체를 생성한다.
		String strVar2 = "김자바";
		String strVar3 = "김자바"; //strVar2와 3은 문자열 객체를 저장
		
		compare(strVar1,strVar2); //strVar1==strVar2를 실행
		compare(strVar2,strVar3); //strVar2==strVar3를 실행
		
		equalTest(strVar1,strVar2); //strVar1.equals(strVar2)를 실행
		equalTest(strVar2,strVar3); //strVar2.equals(strVar3)를 실행
	}
	public static void compare(String str1, String str2) {
		if(str1 == str2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
	}
	public static void equalTest(String str1, String str2) {
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}