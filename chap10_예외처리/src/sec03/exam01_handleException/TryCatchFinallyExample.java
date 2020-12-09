package sec03.exam01_handleException;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		//forName()메소드는 Class 클래스의 static 메소드로서, String타입으로 주어진 매개값을 이름으로 갖는 class를 찾아 반환해 준다.
		//ClassNotFound예외는 일반예외이므로, try-catch문으로 예외처리코드를 작성해주어야 한다.
		//Class clazz = Class.forName("java.lang.String2");
		
		//String클래스는 java.lang 패키지에 속하므로 패키지와 함께 클래스 이름을 Class.forName()의 매개값으로 전달해준다.
		String str1 = "java.lang.String";
		try {
			Class clazz = Class.forName(str1);
			System.out.println(str1 + "라는 클래스를 찾았습니다.");
		} catch(ClassNotFoundException e) {
			System.out.println(str1 + "라는 클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("반드시 실행되는 finally 구문을 실행한 뒤, 프로그램을 종료합니다.");
		}
		System.out.println();
		
		//String2라는 클래스는 java.lang 패키지에 속하지 않으므로 Class.forName()의 매개값으로 전달하면 ClaSSNotFoundException이 발생한다.
		String str2 = "java.lang.String2";
		try {
			Class clazz1 = Class.forName(str2);
			System.out.println(str2 + "라는 클래스를 찾았습니다.");
		} catch(ClassNotFoundException e) {
			System.out.println(str2 + "라는 클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("반드시 실행되는 finally 구문을 실행한 뒤, 프로그램을 종료합니다.");
		}
	}
}