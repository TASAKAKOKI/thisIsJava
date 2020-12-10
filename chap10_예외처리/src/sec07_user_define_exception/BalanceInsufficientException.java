package sec07_user_define_exception;

/* 만들고자 하는 예외가 일반 예외라면, Exception을 상속하고
 * 실행예외라면, RuntimeException을 상속하면 된다.
 */
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {super(message);}
	//super는 상속받은 부모 클래스의 생성자를 호출하는 코드이다.
	//부모 클래스의 생성자를 message를 매개값을 주어 호출한다.
}

/*예외 발생시키는 법
 * throw new XXXException(); 또는
 * throw new XXXException("메시지");
 * 
 * 
 * public void method() throws XXXException {//여기를 잘 보면, throws로 예외를 떠넘기고 있다.
 * 	throw new XXXException("메시지"); // 여기서 예외를 발생시키고, 이런 코드를 포함한 메소드는 거의 throws라는 예외 떠넘기기 기능을 갖고 있다.
 * }
 */