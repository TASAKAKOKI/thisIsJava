package sec05_보조스트림.exam05_bufferedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args)throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0, end = 0;
		
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam03_bufferedInputStream";

		//입력스트림과 출력스트림 양쪽에 버퍼를 사용하지 않았을 때
			fis = new FileInputStream(filePath + "/image.jpg");
			fos = new FileOutputStream(filePath + "/image2.jpg");
			start = System.currentTimeMillis();
			while( (data= fis.read()) != -1) {
				fos.write(data);
			}
			fos.flush();
			end = System.currentTimeMillis();
			fos.close();
			fis.close();
			
			System.out.println("입출력스트림에 모두 버퍼를 사용하지 않았을 때: " + (end-start) + "ms");
			
		//출력스트림에 버퍼를 사용하지 않았을 때 걸린 시간 조사
			fis = new FileInputStream(filePath + "/image.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(filePath + "/image2.jpg");
			start = System.currentTimeMillis();
			while( (data= bis.read()) != -1) {
				fos.write(data);
			}
			fos.flush();
			end = System.currentTimeMillis();
			fos.close();
			bis.close();
			fis.close();
			
			System.out.println("출력스트림에 버퍼를 사용하지 않았을 때: " + (end-start) + "ms");
		//입출력 스트림 모두에 버퍼를 사용했을 때 걸린 시간 조사
			fis = new FileInputStream(filePath + "/image.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(filePath + "/image2.jpg");
			bos = new BufferedOutputStream(fos);
			start = System.currentTimeMillis();
			while( (data= bis.read()) != -1) {
				bos.write(data);
			}
			bos.flush();
			end = System.currentTimeMillis();
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			
			System.out.println("출력스트림에 버퍼를 사용했을 때: " + (end-start) + "ms");
	}
}