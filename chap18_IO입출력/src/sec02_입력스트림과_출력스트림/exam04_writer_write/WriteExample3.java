package sec02_�Է½�Ʈ����_��½�Ʈ��.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam04_writer_write\\Test.txt");
		char[] data = "���ڹ�".toCharArray();
		writer.write(data,1,2);

		writer.flush();
		writer.close();
	}
}