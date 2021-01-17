package sec04_����File_�����.exam02_fileInputStream;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec04_����File_�����/exam02_fileInputStream";
		
		try {
			FileInputStream fis = new FileInputStream(directory + "/FileInputStreamExample.java");
				//FileInputStream()������ IOException�� �߻��� �� ����
			int data;
			while( (data =fis.read()) != -1) {
					//read()�޼ҵ尡 �� ����Ʈ�� �����Ƿ�, while���� ���� �ݺ��� �� ����.
					//����Ʈ ��ü�� �д� �޼ҵ带 ���� ���� ����
				//read()������ IOException�� �߻��� �� ����
				System.out.write(data);
					//System.out�� OutputStream�� �ʵ��̹Ƿ� write�� ����.
			}
			System.out.flush();
				//write()�� ȣ���ϰ� ���� �ݵ�� flush()�� ȣ���� �־�� �Ѵ�.
				//���� �޼ҵ尡 ������, ���α׷��� ����Ǳ� ������ 
				//out�� ������ �ִ� buffer�� �ڵ������� ������Ƿ�, flush()�� ���� �ʾƵ� ����
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}