package sec02_�Է½�Ʈ����_��½�Ʈ��.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam03_reader_read\\Test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf,1,2); //cbuf�� ���� ������ 2�ڸ� �о 1�� ��ġ���� ����
		for(int i=0; i<cbuf.length;i++) {
			System.out.println(readCharNo);
			System.out.println(cbuf[i] + " ");
		}
		reader.close();
	}
}