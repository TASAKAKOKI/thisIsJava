package sec07_TCP네트워킹.exam02_data_read_write;

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
			serverSocket = new ServerSocket(); //ServerSocket객체 생성
			serverSocket.bind( new InetSocketAddress("localhost", 5001) );
			
			//서버는 항상 클라이언트의 연결 요청을 기다려야 하므로, while문으로 처리
			while(true) {
				System.out.println("[클라이언트로부터 연결 요청을 기다림...]");
				Socket socket = serverSocket.accept();//연결요청이 되기 전까지 블로킹이 되다가, 연결요청이 들어오면, Socket을 반환
				InetSocketAddress isa  = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
				
				//socket을 통해 데이터를 받고 보내는 코드 작성
					byte[] byteArr = null;
					String message = null;
					//클라이언트로부터 데이터 받기
						InputStream is = socket.getInputStream();
						byteArr = new byte[100];
						int readByteCount = is.read(byteArr);
						message = new String(byteArr, 0, readByteCount, "UTF-8");
						System.out.println("[데이터 받기 성공]: " + message);
					
					//클라이언트로 데이터 보내기
						OutputStream os = socket.getOutputStream();
						message = "Hello Client?";
						byteArr = message.getBytes("UTF-8");
						os.write(byteArr);
						os.flush();
						System.out.println("[데이터 보내기 성공]");
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