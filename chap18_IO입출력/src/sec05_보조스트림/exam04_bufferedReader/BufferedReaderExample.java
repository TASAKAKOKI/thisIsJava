package sec05_보조스트림.exam04_bufferedReader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
							//바이트기반스트림을 문자기반스트림으로 변환
		BufferedReader br = new BufferedReader(reader);
							//문자기반스트림에 버퍼를 제공
		
		System.out.print("입력: ");
		String inputData = br.readLine(); //BufferedReader의 readLine()메소드는 입력된 한 줄을 모두 읽는다.
		System.out.println("출력: " + inputData);
		
		br.close();
		reader.close();
		is.close();
	}
}