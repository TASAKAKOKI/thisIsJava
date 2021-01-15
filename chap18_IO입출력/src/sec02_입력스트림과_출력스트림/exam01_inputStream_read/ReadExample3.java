package sec02_입력스트림과_출력스트림.exam01_inputStream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam01_inputStream_read\\Test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8]; //8크기만큼의 배열을 생성
		readByteNo = is.read(readBytes,2,3); //인덱스 2부터 3의 길이만큼 저장 
		for(int i=0; i<readBytes.length; i++) {
			System.out.print(readBytes[i] + " ");
		}
		System.out.println("\n읽은 바이트 수: " + readByteNo);
		
		is.close();
	}
}