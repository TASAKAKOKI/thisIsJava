package sec03_�ܼ�Console_�����.exam02_console;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		
		System.out.print("���̵�: ");
		String id = console.readLine();
		
		System.out.print("�н�����: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("------------------------");
		System.out.println("�Էµ� id: " + id);
		System.out.println("�Էµ� password: " + strPassword);
		//��Ŭ���������� console�� null���� �����Ƿ� ���� �߻�
	}
}