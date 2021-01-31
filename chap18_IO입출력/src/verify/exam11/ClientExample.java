package verify.exam11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ClientExample {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec04_����File_�����/exam03_fileOutputStream/house.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		//-> ���� �̸��� ����� ���� 100����Ʈ�� ������
		byte[] fileNameBytes = fileName.getBytes("UTF-8");
		fileNameBytes = Arrays.copyOf(fileNameBytes, 100); //������ �迭�� ���� 100�� �迭�� ����
		os.write(fileNameBytes);
		
		System.out.println("[���� ������ ����] " + fileName);
		//->���ϵ����͸� ������.
		FileInputStream fis = new FileInputStream(file);
		byte[] bytes = new byte[100];
		int readByteCount = -1;
		while( (readByteCount = fis.read(bytes)) != -1) {
			os.write(bytes, 0, readByteCount);
		}
		
		//-<�������
		os.flush();
		System.out.println("[���� ������ �Ϸ�]");
		
		fis.close();
		os.close();
		socket.close();
		
	}
}