package sec03_�ܼ�Console_�����.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {
		System.out.println("==�޴�==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.print("�޴��� �����ϼ���: ");
		
		InputStream is = System.in;
		char selectedNo = (char) is.read();
		switch(selectedNo) {
		case '1':
			System.out.println("������ ��ȸ�մϴ�.");
			break;
		case '2':
			System.out.println("������ ����մϴ�.");
			break;
		case '3':
			System.out.println("������ �Ա��մϴ�.");
			break;
		case '4':
			System.out.println("�����մϴ�.");
			break;
		default:
			System.out.println("�߸� �����̽��ϴ�.");
		}
	}
}