package chap11_�⺻API��ť��Ʈ;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
		//������ - �ý��� �� ���� - �ý��� -��� �ý��� ���� - ��� - ȯ�溯�� - �ý��� ���� ���� ������ �ش��ϴ� ���� getenv()�� �Ű������� �����ϸ� �� ���� String���� ��ȯ�ȴ�. 
	}
}