package sec05_보조스트림.exam02_outputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception{
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam02_outputStreamWriter";		
		FileOutputStream fos = new FileOutputStream(directory + "/file.txt" );
			//문자만 저장 가능한 파일에 바이트기반 FileOutputStream을 이용하여 출력하고자 함.
			//문자를 저장하려면, 문자를 바이트배열로 만들어서 출력해야 함.
		Writer writer = new OutputStreamWriter(fos);
			//바로 문자를 출력하기 위해, Writer로 변환을 해서 출력하고자 함.
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		fos.close();

		System.out.println("완료되었습니다.");
	}
}