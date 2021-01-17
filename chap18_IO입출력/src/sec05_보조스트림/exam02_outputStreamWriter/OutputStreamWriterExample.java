package sec05_������Ʈ��.exam02_outputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception{
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec05_������Ʈ��/exam02_outputStreamWriter";		
		FileOutputStream fos = new FileOutputStream(directory + "/file.txt" );
			//���ڸ� ���� ������ ���Ͽ� ����Ʈ��� FileOutputStream�� �̿��Ͽ� ����ϰ��� ��.
			//���ڸ� �����Ϸ���, ���ڸ� ����Ʈ�迭�� ���� ����ؾ� ��.
		Writer writer = new OutputStreamWriter(fos);
			//�ٷ� ���ڸ� ����ϱ� ����, Writer�� ��ȯ�� �ؼ� ����ϰ��� ��.
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		fos.close();

		System.out.println("�Ϸ�Ǿ����ϴ�.");
	}
}