package sec07_TCP네트워킹.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) { 
		Socket socket = null;
		
		try {
			socket = new Socket(); //socket생성
			System.out.println("[연결 요청...]");
			socket.connect( new InetSocketAddress("localhost", 5002) ); //socket에서 서버로 연결 요청
			System.out.println("[연결 성공]");
			
			//socket을 통해 데이터를 받고 보내는 코드 작성
				byte[] byteArr = null;
				String message = null;
				
				//서버로 데이터 보내기
					OutputStream os = socket.getOutputStream();
					message = "Hello Server?";
					byteArr = message.getBytes("UTF-8");
					os.write(byteArr);
					os.flush();
					System.out.println("[데이터 보내기 성공]");
					
				//서버로부터 데이터 받기
					InputStream is = socket.getInputStream();
					byteArr = new byte[100];
					int readByteCount = is.read(byteArr);
					message = new String(byteArr, 0, readByteCount, "UTF-8");
					System.out.println("[데이터 받기 성공]: " + message);
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
