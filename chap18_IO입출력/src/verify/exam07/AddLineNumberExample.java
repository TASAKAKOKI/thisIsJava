package verify.exam07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

/* 소스 파일을 읽어 라인 번호를 추가시켜 출력하는 프로그램을 작성하기
 */
public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam04_bufferedReader/BufferedReaderExample.java";

		//작성 위치
			FileReader fr = new FileReader(filePath);
		//읽기 성능 향상을 위해 문자기반스트림(FileReader)에 버퍼를 제공
			BufferedReader br = new BufferedReader(fr);

		int lineCount = 0;
		String readData;
		//문자를 계속 읽어들이는 동안 무한루프
			while( (readData=br.readLine()) != null) {//BufferedReader의 readLine()메소드는 입력된 한 줄을 모두 읽는다.
				lineCount++;
				System.out.print(lineCount + ": " + readData + "\n");
			}
		System.out.println("[총 " + lineCount + "줄의 라인이 출력되었습니다.]");
		br.close();
		fr.close();
		
	}
}