package sec07_TCP��Ʈ��ŷ.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) { 
		Socket socket = null;
		
		try {
			socket = new Socket(); //socket����
			System.out.println("[���� ��û...]");
			socket.connect( new InetSocketAddress("localhost", 5002) ); //socket���� ������ ���� ��û
			System.out.println("[���� ����]");
			
			//socket�� ���� �����͸� �ް� ������ �ڵ� �ۼ�
				byte[] byteArr = null;
				String message = null;
				
				//������ ������ ������
					OutputStream os = socket.getOutputStream();
					message = "Hello Server?";
					byteArr = message.getBytes("UTF-8");
					os.write(byteArr);
					os.flush();
					System.out.println("[������ ������ ����]");
					
				//�����κ��� ������ �ޱ�
					InputStream is = socket.getInputStream();
					byteArr = new byte[100];
					int readByteCount = is.read(byteArr);
					message = new String(byteArr, 0, readByteCount, "UTF-8");
					System.out.println("[������ �ޱ� ����]: " + message);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
