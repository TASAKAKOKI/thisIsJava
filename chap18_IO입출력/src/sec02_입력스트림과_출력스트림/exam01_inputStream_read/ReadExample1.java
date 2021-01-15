package sec02_입력스트림과_출력스트림.exam01_inputStream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	//FileInputStream()은 파일이 없는 경우 예외를 발생시킬 수 있기 때문에
	//해당 메소드를 호출하는 메소드(main)에서 throws Exception처리를 해주어야 한다.
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam01_inputStream_read\\Test.txt");
		int readByte;
		int count = 0;
		//방법1
		/*
		while( (readByte = is.read() ) != -1 ) {
			count += 1;
			System.out.println("읽은 바이트 수: " + count + " 바이트를 읽었습니다.");
			System.out.println("읽은 바이트: " + readByte + " -> 문자로 변환 -> " + (char) readByte);
		}
		*/
		//방법2
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.println("읽은 바이트 수: " + count + " 바이트를 읽었습니다.");
			System.out.println("읽은 바이트: " + readByte + " -> 문자로 변환 -> " + (char) readByte);
		}
		//읽은 바이트를 (char)키워드를 이용하여 강제타입변환을 하면, 문자를 얻을 수 있다. (아스키 코드 -> 문자 변환)
		is.close();
	}
}