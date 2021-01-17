package sec05_보조스트림.exam03_bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*Buffer를 사용했을 경우와 그렇지 않은 경우 얼만큼의 시간이 차이나는지를 확인
 */
public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		long start;
		long end;
		
		//Buffer를 사용하지 않았을 때,
			String filePath = "C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec05_보조스트림\\exam03_bufferedInputStream/image.jpg";
			FileInputStream fis1 = new FileInputStream(filePath);
			start = System.currentTimeMillis();
			while(fis1.read() != -1) { }
			end = System.currentTimeMillis();
			System.out.println("사용하지 않았을 때 걸린 시간: " + (end - start) + "ms");
			fis1.close();
		
		//Buffer를 사용했을 때,
			FileInputStream fis2 = new FileInputStream(filePath);
			BufferedInputStream bis = new BufferedInputStream(fis2); //BufferedInputStream을 생성시, 바이트InputStream을 매개값으로 준다. 
			start = System.currentTimeMillis();
			while(bis.read() != -1) { }
			end = System.currentTimeMillis();
			System.out.println("사용했을 때 걸린 시간: " + (end - start) + "ms");
			bis.close();
			fis2.close();
	}
}