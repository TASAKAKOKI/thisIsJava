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
		
		System.out.println("[서버 시작]");
		
		while(true) {
			try {
				Socket socket = sc.accept(); //클라이언트로부터 연결 요청이 들어올때까지 블로킹 하다가, 통신용 Socket객체를 리턴
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[100];
				int readByteCount = -1;
				//-> 클라이언트가 보낸 100바이트를 먼저 읽고 파일 이름을 얻어내기
					is.read(bytes,0,100);
					String fileName = new String(bytes, 0, bytes.length, "UTF-8");
				//-< 여기까지
				fileName = fileName.trim();		
					
				System.out.println("[파일 받기 시작] " + fileName);
				
				//-> 이어서 데이터를 받고 C:/Temp 폴더에 저정하기
				FileOutputStream fos = new FileOutputStream("C:/Temp/" + fileName);
				while( (readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes, 0, readByteCount);
				}
				fos.flush();
				//-< 여기까지
				System.out.println("[파일 받기 완료]");
				fos.close();
				is.close();
				socket.close();
			} catch(Exception e) { break; }
		}
		
		sc.close();
		System.out.println("[서버 종료]");
	}
}