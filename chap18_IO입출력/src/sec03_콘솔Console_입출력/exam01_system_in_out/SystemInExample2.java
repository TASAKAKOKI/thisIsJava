package sec03_�ܼ�Console_�����.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		byte[] byteData = new byte[100];
		
		System.out.print("�̸�: ");
		int nameBytes = is.read(byteData);
		String name = new String(byteData, 0, nameBytes -2);
		
		System.out.print("�ϰ� ���� ��: ");
		int commentBytes = is.read(byteData);
		String comment = new String(byteData, 0, commentBytes -2);
	
		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�Է��� �ϰ� ���� ��: " + comment);
	}
}