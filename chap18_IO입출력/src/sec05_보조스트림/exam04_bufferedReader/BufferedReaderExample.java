package sec05_������Ʈ��.exam04_bufferedReader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
							//����Ʈ��ݽ�Ʈ���� ���ڱ�ݽ�Ʈ������ ��ȯ
		BufferedReader br = new BufferedReader(reader);
							//���ڱ�ݽ�Ʈ���� ���۸� ����
		
		System.out.print("�Է�: ");
		String inputData = br.readLine(); //BufferedReader�� readLine()�޼ҵ�� �Էµ� �� ���� ��� �д´�.
		System.out.println("���: " + inputData);
		
		br.close();
		reader.close();
		is.close();
	}
}