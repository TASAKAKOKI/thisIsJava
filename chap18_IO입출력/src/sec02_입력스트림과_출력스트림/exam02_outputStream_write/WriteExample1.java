package sec02_�Է½�Ʈ����_��½�Ʈ��.exam02_outputStream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO�����\\src\\sec02_�Է½�Ʈ����_��½�Ʈ��\\exam02_outputStream_write\\Test.txt");
		byte[] data = "ABC".getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		} 	//���� write()�޼ҵ�� for������ �ϳ��� ���
		os.flush();
		//��½�Ʈ������ write�� ȣ���ϸ�,
		//data�� ��� buffer�� �Ͽ��ٰ�, ����� �ȴ�.
		//�ٵ� buffer�� �� ���� ������, ����� ���� �ʴ´�.
		//�̷���, ���������� ����� �����ִ� ������ �ϴ� 
		//flush()�޼ҵ带 �����ϸ� ȣ�����ִ� ���� ����.
		
		//write()�� �ϰ�, �ٸ� �۾��� ���� �ʰ�, ���α׷��� ������
		//�ڵ������� buffer�� ������ ������� ����� �̷�������,
		//write()�� �ϰ�, ���α׷��� ������ �ʰ�, �ٸ� �۾��� �ϰ� �Ǹ�,
		//�����ʹ� buffer�� �ܷ��ϰ� �ǹǷ�, ����� �̷����� �ʴ´�.
		os.close();
	}
}