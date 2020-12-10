package sec06_throws;

public class ThrowsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	public static void findClass()throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		/*java api docs에 따르면,
		 *forName(String str)메소드는 다음과 같이 정의되어있다.
		 *	public static Class<?> forName​(String className) throws ClassNotFoundException
		 * 따라서, forName()메소드가 호출가 호출된 곳에서 예외처리를 해야한다.
		 * 그런데, forName()를 호출한 findClass()메소드도 다시 한 번 throws 키워드로 예외를 떠넘겼으므로,
		 * findClass()가 호출된 곳에서 예외처리를 해주어야 한다.
		 */
	}
}