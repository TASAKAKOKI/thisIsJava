package sec02_�Է½�Ʈ����_��½�Ʈ��.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample5 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam04_writer_write\\Test.txt");
		
		String data = "�ȳ� �ڹ� ���α׷�";
		writer.write(data,3,2); //���ڿ��� 3�ε����κ��� 2���� ���ڸ� ���

		writer.flush();
		writer.close();
	}
}