package sec02_�Է½�Ʈ����_��½�Ʈ��.exam02_outputStream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam02_outputStream_write\\Test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data,1,2); //�ε��� ��ġ 1���� 2���� �����ϹǷ�, "BC"�� ����Ѵ�.
		
		os.flush();
		os.close();
	}
}