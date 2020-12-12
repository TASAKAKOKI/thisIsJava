package verify.exam07;

public class LoginExample {
	public static void main(String args[]) {
		try {
			login("blue", "12345");
			System.out.println("���������� �α��� �Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		// id�� "blue"�� �ƴ϶��, NotExistIDException ���� �߻�
		if (!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		// password�� "12345"�� �ƴ϶�� WrongPasswordException ���� �߻�
		if (!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
}