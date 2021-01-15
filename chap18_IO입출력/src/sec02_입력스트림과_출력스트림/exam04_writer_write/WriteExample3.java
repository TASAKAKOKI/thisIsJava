package sec02_입력스트림과_출력스트림.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam04_writer_write\\Test.txt");
		char[] data = "김자바".toCharArray();
		writer.write(data,1,2);

		writer.flush();
		writer.close();
	}
}