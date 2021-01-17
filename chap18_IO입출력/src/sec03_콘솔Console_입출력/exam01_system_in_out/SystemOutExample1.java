package sec03_콘솔Console_입출력.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		
		for(byte b=48; b<58; b++) {
			//48은 아스키 코드로 0이며, 57은 9이다.
			os.write(b);
		}
		
		os.write(13);
		//System.out.println();와 같은 역할
		//13은 아스키코드로 캐리지리턴(/r)이다.
		for(byte b=97; b<123; b++) {
			//97은 아스키코드로 a이며, 122는 z이다.
			os.write(b);
		}
		os.write(13);
		for(byte b=65; b<91; b++) {
			//65는 아스키코드로 A이며, 91은 Z이다.
			os.write(b);
		}

		os.write(13);
		//한글을 출력하는 법
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();

		
	}
}