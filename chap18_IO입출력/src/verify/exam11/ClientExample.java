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
		
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec04_파일File_입출력/exam03_fileOutputStream/house.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		//-> 파일 이름이 저장된 길이 100바이트를 보내기
		byte[] fileNameBytes = fileName.getBytes("UTF-8");
		fileNameBytes = Arrays.copyOf(fileNameBytes, 100); //기존의 배열을 길이 100인 배열로 복사
		os.write(fileNameBytes);
		
		System.out.println("[파일 보내기 시작] " + fileName);
		//->파일데이터를 보내기.
		FileInputStream fis = new FileInputStream(file);
		byte[] bytes = new byte[100];
		int readByteCount = -1;
		while( (readByteCount = fis.read(bytes)) != -1) {
			os.write(bytes, 0, readByteCount);
		}
		
		//-<여기까지
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
		
	}
}