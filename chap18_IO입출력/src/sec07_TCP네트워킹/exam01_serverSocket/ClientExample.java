package sec07_TCP��Ʈ��ŷ.exam01_serverSocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) { 
		Socket socket = null;
		
		try {
			socket = new Socket(); //socket����
			System.out.println("[���� ��û...]");
			socket.connect( new InetSocketAddress("localhost", 5001) ); //socket���� ������ ���� ��û
			System.out.println("[���� ����]");
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
