package sec05_보조스트림.exam07_printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam07_printStream";		
		FileOutputStream fos = new FileOutputStream(filePath + "/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조스트림]");
		ps.print("마치 ");
		ps.print("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
	}
}