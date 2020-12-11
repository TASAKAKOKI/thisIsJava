package verify.exam07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}

	public WrongPasswordException(String msg) {
		super(msg);
	}
	//생성자를 2가지 버전으로 생성해준다.
	//하나는 매개값을 주지 않을 경우의 생성자,
	//하나는 매개값을 주었을 때의 생성자.
	//매개값은, 곧바로 예외의 메세지가 된다.
}