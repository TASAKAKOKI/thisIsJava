package sec02_�Է½�Ʈ����_��½�Ʈ��.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam03_reader_read\\Test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = ""; //��ü ���ڿ��� ������ ��ü ����
		while( (readCharNo=reader.read(cbuf)) != -1) {
			data += new String(cbuf,0,readCharNo);
			System.out.println(readCharNo);
		}
		System.out.println(data);
		reader.close();
	}
}