package sec02_입력스트림과_출력스트림.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam03_reader_read\\Test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = ""; //전체 문자열을 저장할 객체 생성
		while( (readCharNo=reader.read(cbuf)) != -1) {
			data += new String(cbuf,0,readCharNo);
			System.out.println(readCharNo);
		}
		System.out.println(data);
		reader.close();
	}
}