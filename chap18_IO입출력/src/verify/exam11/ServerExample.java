package verify.exam11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket sc = new ServerSocket();
		sc.bind(new InetSocketAddress("localhost",5001));
		
		System.out.println("[���� ����]");
		
		while(true) {
			try {
				Socket socket = sc.accept(); //Ŭ���̾�Ʈ�κ��� ���� ��û�� ���ö����� ���ŷ �ϴٰ�, ��ſ� Socket��ü�� ����
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[100];
				int readByteCount = -1;
				//-> Ŭ���̾�Ʈ�� ���� 100����Ʈ�� ���� �а� ���� �̸��� ����
					is.read(bytes,0,100);
					String fileName = new String(bytes, 0, bytes.length, "UTF-8");
				//-< �������
				fileName = fileName.trim();		
					
				System.out.println("[���� �ޱ� ����] " + fileName);
				
				//-> �̾ �����͸� �ް� C:/Temp ������ �����ϱ�
				FileOutputStream fos = new FileOutputStream("C:/Temp/" + fileName);
				while( (readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes, 0, readByteCount);
				}
				fos.flush();
				//-< �������
				System.out.println("[���� �ޱ� �Ϸ�]");
				fos.close();
				is.close();
				socket.close();
			} catch(Exception e) { break; }
		}
		
		sc.close();
		System.out.println("[���� ����]");
	}
}