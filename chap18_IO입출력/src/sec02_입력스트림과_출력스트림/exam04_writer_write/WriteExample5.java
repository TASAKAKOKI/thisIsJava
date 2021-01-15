package sec02_입력스트림과_출력스트림.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample5 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam04_writer_write\\Test.txt");
		
		String data = "안녕 자바 프로그램";
		writer.write(data,3,2); //문자열의 3인덱스로부터 2개의 문자만 출력

		writer.flush();
		writer.close();
	}
}