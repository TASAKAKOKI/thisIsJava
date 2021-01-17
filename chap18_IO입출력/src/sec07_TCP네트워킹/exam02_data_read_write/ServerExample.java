package sec07_TCP��Ʈ��ŷ.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(); //ServerSocket��ü ����
			serverSocket.bind( new InetSocketAddress("localhost", 5001) );
			
			//������ �׻� Ŭ���̾�Ʈ�� ���� ��û�� ��ٷ��� �ϹǷ�, while������ ó��
			while(true) {
				System.out.println("[Ŭ���̾�Ʈ�κ��� ���� ��û�� ��ٸ�...]");
				Socket socket = serverSocket.accept();//�����û�� �Ǳ� ������ ���ŷ�� �Ǵٰ�, �����û�� ������, Socket�� ��ȯ
				InetSocketAddress isa  = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������] " + isa.getHostName());
				
				//socket�� ���� �����͸� �ް� ������ �ڵ� �ۼ�
					byte[] byteArr = null;
					String message = null;
					//Ŭ���̾�Ʈ�κ��� ������ �ޱ�
						InputStream is = socket.getInputStream();
						byteArr = new byte[100];
						int readByteCount = is.read(byteArr);
						message = new String(byteArr, 0, readByteCount, "UTF-8");
						System.out.println("[������ �ޱ� ����]: " + message);
					
					//Ŭ���̾�Ʈ�� ������ ������
						OutputStream os = socket.getOutputStream();
						message = "Hello Client?";
						byteArr = message.getBytes("UTF-8");
						os.write(byteArr);
						os.flush();
						System.out.println("[������ ������ ����]");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch(Exception e) {
				
			}
		}
	}
}