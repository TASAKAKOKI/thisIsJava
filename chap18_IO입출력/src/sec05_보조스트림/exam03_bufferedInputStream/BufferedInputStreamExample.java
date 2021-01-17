package sec05_������Ʈ��.exam03_bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*Buffer�� ������� ���� �׷��� ���� ��� ��ŭ�� �ð��� ���̳������� Ȯ��
 */
public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		long start;
		long end;
		
		//Buffer�� ������� �ʾ��� ��,
			String filePath = "C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec05_������Ʈ��\\exam03_bufferedInputStream/image.jpg";
			FileInputStream fis1 = new FileInputStream(filePath);
			start = System.currentTimeMillis();
			while(fis1.read() != -1) { }
			end = System.currentTimeMillis();
			System.out.println("������� �ʾ��� �� �ɸ� �ð�: " + (end - start) + "ms");
			fis1.close();
		
		//Buffer�� ������� ��,
			FileInputStream fis2 = new FileInputStream(filePath);
			BufferedInputStream bis = new BufferedInputStream(fis2); //BufferedInputStream�� ������, ����ƮInputStream�� �Ű������� �ش�. 
			start = System.currentTimeMillis();
			while(bis.read() != -1) { }
			end = System.currentTimeMillis();
			System.out.println("������� �� �ɸ� �ð�: " + (end - start) + "ms");
			bis.close();
			fis2.close();
	}
}