package sec02_입력스트림과_출력스트림.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam03_reader_read\\Test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf,1,2); //cbuf에 읽은 문자의 2자만 읽어서 1의 위치부터 저장
		for(int i=0; i<cbuf.length;i++) {
			System.out.println(readCharNo);
			System.out.println(cbuf[i] + " ");
		}
		reader.close();
	}
}