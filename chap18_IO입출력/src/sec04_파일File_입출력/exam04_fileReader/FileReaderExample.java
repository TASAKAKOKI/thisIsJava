package sec04_파일File_입출력.exam04_fileReader;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec04_파일File_입출력/exam04_fileReader/FileReaderExample.java";
		FileReader fr = new FileReader(directory);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}