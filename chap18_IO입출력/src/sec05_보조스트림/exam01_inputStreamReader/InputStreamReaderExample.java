package sec05_������Ʈ��.exam01_inputStreamReader;

import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
			//�ַܼ� ���� ����Ʈ�� �Է¹޾� �д´�.
		Reader reader = new InputStreamReader(is);
			//�̸� ���ڷ� �б� ����, InputStreamReader������Ʈ���� �Ű������� ����Ʈ����� InputStreamŸ���� �Ѱ��ش�.
		
		
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
		is.close();
		System.out.println("�Ϸ�Ǿ����ϴ�.");
	}
}