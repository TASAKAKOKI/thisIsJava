package sec02_�Է½�Ʈ����_��½�Ʈ��.exam01_inputStream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam01_inputStream_read\\Test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8]; //8ũ�⸸ŭ�� �迭�� ����
		readByteNo = is.read(readBytes,2,3); //�ε��� 2���� 3�� ���̸�ŭ ���� 
		for(int i=0; i<readBytes.length; i++) {
			System.out.print(readBytes[i] + " ");
		}
		System.out.println("\n���� ����Ʈ ��: " + readByteNo);
		
		is.close();
	}
}