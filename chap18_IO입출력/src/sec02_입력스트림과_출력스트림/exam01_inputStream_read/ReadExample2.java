package sec02_입력스트림과_출력스트림.exam01_inputStream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam01_inputStream_read\\Test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";

		//방법1: while문에서 boolean값으로 처리
		while( (readByteNo = is.read(readBytes)) != -1 ) {
			//read(byte[] b)가 데이터를 읽을 것이 없다면 -1을 반환하여 while문을 벗어난다.
			System.out.println("읽은 바이트 수: " + readByteNo +"bytes");
			data += new String(readBytes, 0, readByteNo);
					//readBytes에 저장된 데이터의 0 인덱스부터 readByteNo만큼의 데이터를 문자열로 생성한다.
		}
		System.out.println(data);
		//방법2:무한루프 처리 후, if문으로 탈출 처리
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			System.out.println("읽은 바이트 수: " + readByteNo +"bytes");
			data += new String(readBytes, 0, readByteNo);
		}
		//읽은 데이터를 문자열로 복원하기
		
		is.close();
	}
}