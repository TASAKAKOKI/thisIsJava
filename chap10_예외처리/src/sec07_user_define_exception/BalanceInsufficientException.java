package sec07_user_define_exception;

/* ������� �ϴ� ���ܰ� �Ϲ� ���ܶ��, Exception�� ����ϰ�
 * ���࿹�ܶ��, RuntimeException�� ����ϸ� �ȴ�.
 */
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {super(message);}
	//super�� ��ӹ��� �θ� Ŭ������ �����ڸ� ȣ���ϴ� �ڵ��̴�.
	//�θ� Ŭ������ �����ڸ� message�� �Ű����� �־� ȣ���Ѵ�.
}

/*���� �߻���Ű�� ��
 * throw new XXXException(); �Ǵ�
 * throw new XXXException("�޽���");
 * 
 * 
 * public void method() throws XXXException {//���⸦ �� ����, throws�� ���ܸ� ���ѱ�� �ִ�.
 * 	throw new XXXException("�޽���"); // ���⼭ ���ܸ� �߻���Ű��, �̷� �ڵ带 ������ �޼ҵ�� ���� throws��� ���� ���ѱ�� ����� ���� �ִ�.
 * }
 */