package sec04_파일File_입출력.exam02_fileInputStream;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		String directory = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec04_파일File_입출력/exam02_fileInputStream";
		
		try {
			FileInputStream fis = new FileInputStream(directory + "/FileInputStreamExample.java");
				//FileInputStream()생성시 IOException이 발생할 수 있음
			int data;
			while( (data =fis.read()) != -1) {
					//read()메소드가 한 바이트씩 읽으므로, while문이 많이 반복될 수 있음.
					//바이트 전체를 읽는 메소드를 쓰는 것이 좋음
				//read()에서도 IOException이 발생할 수 있음
				System.out.write(data);
					//System.out은 OutputStream의 필드이므로 write를 쓴다.
			}
			System.out.flush();
				//write()를 호출하고 나면 반드시 flush()를 호출해 주어야 한다.
				//메인 메소드가 끝나면, 프로그램이 종료되기 때문에 
				//out이 가지고 있는 buffer는 자동적으로 비워지므로, flush()를 하지 않아도 무방
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}