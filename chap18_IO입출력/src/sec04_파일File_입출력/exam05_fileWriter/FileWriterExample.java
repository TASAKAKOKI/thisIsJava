package sec04_파일File_입출력.exam05_fileWriter;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec04_파일File_입출력/exam05_fileWriter/";
		File file = new File(directory + "file.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("FileWriter는 한글로 된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		
		System.out.println("파일에 저장되었습니다.");
	}
}