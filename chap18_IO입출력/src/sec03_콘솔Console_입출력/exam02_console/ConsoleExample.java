package sec03_콘솔Console_입출력.exam02_console;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) throws Exception {
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("------------------------");
		System.out.println("입력된 id: " + id);
		System.out.println("입력된 password: " + strPassword);
		//이클립스에서는 console이 null값을 가지므로 예외 발생
	}
}