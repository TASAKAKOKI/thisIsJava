package verify.exam07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

/* �ҽ� ������ �о� ���� ��ȣ�� �߰����� ����ϴ� ���α׷��� �ۼ��ϱ�
 */
public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec05_������Ʈ��/exam04_bufferedReader/BufferedReaderExample.java";

		//�ۼ� ��ġ
			FileReader fr = new FileReader(filePath);
		//�б� ���� ����� ���� ���ڱ�ݽ�Ʈ��(FileReader)�� ���۸� ����
			BufferedReader br = new BufferedReader(fr);

		int lineCount = 0;
		String readData;
		//���ڸ� ��� �о���̴� ���� ���ѷ���
			while( (readData=br.readLine()) != null) {//BufferedReader�� readLine()�޼ҵ�� �Էµ� �� ���� ��� �д´�.
				lineCount++;
				System.out.print(lineCount + ": " + readData + "\n");
			}
		System.out.println("[�� " + lineCount + "���� ������ ��µǾ����ϴ�.]");
		br.close();
		fr.close();
		
	}
}