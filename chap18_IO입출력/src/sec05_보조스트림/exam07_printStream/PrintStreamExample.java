package sec05_������Ʈ��.exam07_printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec05_������Ʈ��/exam07_printStream";		
		FileOutputStream fos = new FileOutputStream(filePath + "/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ������Ʈ��]");
		ps.print("��ġ ");
		ps.print("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�.");
		
		ps.flush();
		ps.close();
		fos.close();
	}
}