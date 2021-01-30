package sec05_보조스트림.exam01_inputStreamReader;

import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
			//콘솔로 부터 바이트를 입력받아 읽는다.
		Reader reader = new InputStreamReader(is);
			//이를 문자로 읽기 위해, InputStreamReader보조스트림의 매개값으로 바이트기반의 InputStream타입을 넘겨준다.
		
		
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
		is.close();
		System.out.println("완료되었습니다.");
	}
}