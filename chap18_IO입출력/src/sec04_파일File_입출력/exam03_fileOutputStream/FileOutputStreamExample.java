package sec04_����File_�����.exam03_fileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec04_����File_�����/exam03_fileOutputStream";
		
		String originalFileName = directory + "/house.jpg";
			//���� ������ �ִ� ���
		String targetFileName = directory + "/house1.jpg";
			//���� ������ �а�, ���� ������ ����� ������ ���
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;	//���� ����Ʈ ���� ������ int ����
		byte[] readBytes = new byte[100];	//ũ�Ⱑ 100�� ����Ʈ �迭 ����
		while( (readByteNo=fis.read(readBytes)) != -1) { //���� ����Ʈ�� �ִٸ� while�� ����
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		
		fis.close();
		fos.close();
		System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
	}	
}