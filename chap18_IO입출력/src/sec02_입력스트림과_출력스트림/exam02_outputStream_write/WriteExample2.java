package sec02_입력스트림과_출력스트림.exam02_outputStream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam02_outputStream_write\\Test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);
		
		os.flush();
		os.close();
	}
}