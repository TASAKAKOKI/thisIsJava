package sec04_파일File_입출력.exam03_fileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec04_파일File_입출력/exam03_fileOutputStream";
		
		String originalFileName = directory + "/house.jpg";
			//원래 파일이 있는 경로
		String targetFileName = directory + "/house1.jpg";
			//원래 파일을 읽고, 같은 파일을 만들어 저장할 경로
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;	//읽은 바이트 수를 저장할 int 변수
		byte[] readBytes = new byte[100];	//크기가 100인 바이트 배열 생성
		while( (readByteNo=fis.read(readBytes)) != -1) { //읽은 바이트가 있다면 while문 실행
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		
		fis.close();
		fos.close();
		System.out.println("복사가 완료되었습니다.");
	}	
}