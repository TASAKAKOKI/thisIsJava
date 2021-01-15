package sec02_�Է½�Ʈ����_��½�Ʈ��.exam01_inputStream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam01_inputStream_read\\Test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";

		//���1: while������ boolean������ ó��
		while( (readByteNo = is.read(readBytes)) != -1 ) {
			//read(byte[] b)�� �����͸� ���� ���� ���ٸ� -1�� ��ȯ�Ͽ� while���� �����.
			System.out.println("���� ����Ʈ ��: " + readByteNo +"bytes");
			data += new String(readBytes, 0, readByteNo);
					//readBytes�� ����� �������� 0 �ε������� readByteNo��ŭ�� �����͸� ���ڿ��� �����Ѵ�.
		}
		System.out.println(data);
		//���2:���ѷ��� ó�� ��, if������ Ż�� ó��
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			System.out.println("���� ����Ʈ ��: " + readByteNo +"bytes");
			data += new String(readBytes, 0, readByteNo);
		}
		//���� �����͸� ���ڿ��� �����ϱ�
		
		is.close();
	}
}