package verify.exam07;

public class LoginExample {
	public static void main(String args[]) {
		try {
			login("blue", "12345");
			System.out.println("성공적으로 로그인 되었습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id가 "blue"가 아니라면, NotExistIDException 예외 발생
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		} 
		//password가 "12345"가 아니라면 WrongPasswordException 예외 발생
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}