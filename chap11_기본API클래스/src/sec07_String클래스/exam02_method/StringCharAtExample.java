package sec07_StringŬ����.exam02_method;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-3230123";
		char sex = ssn.charAt(7); //7��°�ڸ��� ���ڴ� sex�� �ǹ�
		switch(sex) {
			case '1':
			case '3':
				System.out.println("���� �Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("���� �Դϴ�.");
				break;
		}
	}
}