package sec07_TCP��Ʈ��ŷ.exam01_serverSocket;

import java.io.IOException;
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