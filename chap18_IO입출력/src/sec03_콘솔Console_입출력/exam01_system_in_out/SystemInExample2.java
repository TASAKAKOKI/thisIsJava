package sec03_콘솔Console_입출력.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		byte[] byteData = new byte[100];
		
		System.out.print("이름: ");
		int nameBytes = is.read(byteData);
		String name = new String(byteData, 0, nameBytes -2);
		
		System.out.print("하고 싶은 말: ");
		int commentBytes = is.read(byteData);
		String comment = new String(byteData, 0, commentBytes -2);
	
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은 말: " + comment);
	}
}