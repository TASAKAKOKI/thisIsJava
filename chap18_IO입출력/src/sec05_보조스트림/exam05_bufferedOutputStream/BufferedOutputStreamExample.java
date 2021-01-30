package sec05_������Ʈ��.exam05_bufferedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args)throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0, end = 0;
		
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec05_������Ʈ��/exam03_bufferedInputStream";

		//�Է½�Ʈ���� ��½�Ʈ�� ���ʿ� ���۸� ������� �ʾ��� ��
			fis = new FileInputStream(filePath + "/image.jpg");
			fos = new FileOutputStream(filePath + "/image2.jpg");
			start = System.currentTimeMillis();
			while( (data= fis.read()) != -1) {
				fos.write(data);
			}
			fos.flush();
			end = System.currentTimeMillis();
			fos.close();
			fis.close();
			
			System.out.println("����½�Ʈ���� ��� ���۸� ������� �ʾ��� ��: " + (end-start) + "ms");
			
		//��½�Ʈ���� ���۸� ������� �ʾ��� �� �ɸ� �ð� ����
			fis = new FileInputStream(filePath + "/image.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(filePath + "/image2.jpg");
			start = System.currentTimeMillis();
			while( (data= bis.read()) != -1) {
				fos.write(data);
			}
			fos.flush();
			end = System.currentTimeMillis();
			fos.close();
			bis.close();
			fis.close();
			
			System.out.println("��½�Ʈ���� ���۸� ������� �ʾ��� ��: " + (end-start) + "ms");
		//����� ��Ʈ�� ��ο� ���۸� ������� �� �ɸ� �ð� ����
			fis = new FileInputStream(filePath + "/image.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(filePath + "/image2.jpg");
			bos = new BufferedOutputStream(fos);
			start = System.currentTimeMillis();
			while( (data= bis.read()) != -1) {
				bos.write(data);
			}
			bos.flush();
			end = System.currentTimeMillis();
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			
			System.out.println("��½�Ʈ���� ���۸� ������� ��: " + (end-start) + "ms");
	}
}