package sec04_����File_�����.exam05_fileWriter;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec04_����File_�����/exam05_fileWriter/";
		File file = new File(directory + "file.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("FileWriter�� �ѱ۷� �� " + "\r\n");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
		fw.flush();
		fw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}