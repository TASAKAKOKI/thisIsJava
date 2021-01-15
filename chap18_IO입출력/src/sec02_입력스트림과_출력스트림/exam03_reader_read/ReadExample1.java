package sec02_입력스트림과_출력스트림.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam03_reader_read\\Test.txt");
		int readData;
		while( (readData=reader.read()) != -1) {
			System.out.print( (char)readData);
		}
		reader.close();
	}
}