package sec07_TCP네트워킹.exam01_serverSocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(); //ServerSocket객체 생성
			serverSocket.bind( new InetSocketAddress("localhost", 5001) );
			
			//서버는 항상 클라이언트의 연결 요청을 기다려야 하므로, while문으로 처리
			while(true) {
				System.out.println("[클라이언트로부터 연결 요청을 기다림...]");
				Socket socket = serverSocket.accept();//연결요청이 되기 전까지 블로킹이 되다가, 연결요청이 들어오면, Socket을 반환
				
				InetSocketAddress isa  = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
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