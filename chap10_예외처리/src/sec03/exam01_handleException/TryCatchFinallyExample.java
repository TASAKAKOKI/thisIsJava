package sec03.exam01_handleException;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		//forName()�޼ҵ�� Class Ŭ������ static �޼ҵ�μ�, StringŸ������ �־��� �Ű����� �̸����� ���� class�� ã�� ��ȯ�� �ش�.
		//ClassNotFound���ܴ� �Ϲݿ����̹Ƿ�, try-catch������ ����ó���ڵ带 �ۼ����־�� �Ѵ�.
		//Class clazz = Class.forName("java.lang.String2");
		
		//StringŬ������ java.lang ��Ű���� ���ϹǷ� ��Ű���� �Բ� Ŭ���� �̸��� Class.forName()�� �Ű������� �������ش�.
		String str1 = "java.lang.String";
		try {
			Class clazz = Class.forName(str1);
			System.out.println(str1 + "��� Ŭ������ ã�ҽ��ϴ�.");
		} catch(ClassNotFoundException e) {
			System.out.println(str1 + "��� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("�ݵ�� ����Ǵ� finally ������ ������ ��, ���α׷��� �����մϴ�.");
		}
		System.out.println();
		
		//String2��� Ŭ������ java.lang ��Ű���� ������ �����Ƿ� Class.forName()�� �Ű������� �����ϸ� ClaSSNotFoundException�� �߻��Ѵ�.
		String str2 = "java.lang.String2";
		try {
			Class clazz1 = Class.forName(str2);
			System.out.println(str2 + "��� Ŭ������ ã�ҽ��ϴ�.");
		} catch(ClassNotFoundException e) {
			System.out.println(str2 + "��� Ŭ������ �������� �ʽ��ϴ�.");
		} finally {
			System.out.println("�ݵ�� ����Ǵ� finally ������ ������ ��, ���α׷��� �����մϴ�.");
		}
	}
}