package sec02_�Է½�Ʈ����_��½�Ʈ��.exam01_inputStream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	//FileInputStream()�� ������ ���� ��� ���ܸ� �߻���ų �� �ֱ� ������
	//�ش� �޼ҵ带 ȣ���ϴ� �޼ҵ�(main)���� throws Exceptionó���� ���־�� �Ѵ�.
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam01_inputStream_read\\Test.txt");
		int readByte;
		int count = 0;
		//���1
		/*
		while( (readByte = is.read() ) != -1 ) {
			count += 1;
			System.out.println("���� ����Ʈ ��: " + count + " ����Ʈ�� �о����ϴ�.");
			System.out.println("���� ����Ʈ: " + readByte + " -> ���ڷ� ��ȯ -> " + (char) readByte);
		}
		*/
		//���2
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.println("���� ����Ʈ ��: " + count + " ����Ʈ�� �о����ϴ�.");
			System.out.println("���� ����Ʈ: " + readByte + " -> ���ڷ� ��ȯ -> " + (char) readByte);
		}
		//���� ����Ʈ�� (char)Ű���带 �̿��Ͽ� ����Ÿ�Ժ�ȯ�� �ϸ�, ���ڸ� ���� �� �ִ�. (�ƽ�Ű �ڵ� -> ���� ��ȯ)
		is.close();
	}
}