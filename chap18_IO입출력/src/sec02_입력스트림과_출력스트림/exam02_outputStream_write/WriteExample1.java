package sec02_입력스트림과_출력스트림.exam02_outputStream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Users\\KOKHEEJIN\\eclipse-workspace\\chap18_IO입출력\\src\\sec02_입력스트림과_출력스트림\\exam02_outputStream_write\\Test.txt");
		byte[] data = "ABC".getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		} 	//현재 write()메소드는 for문으로 하나씩 출력
		os.flush();
		//출력스트림에서 write를 호출하면,
		//data가 잠시 buffer에 하였다가, 출력이 된다.
		//근데 buffer가 꽉 차지 않으면, 출력이 되지 않는다.
		//이럴때, 강제적으로 출력을 시켜주는 역할을 하는 
		//flush()메소드를 가능하면 호출해주는 것이 좋다.
		
		//write()를 하고, 다른 작업을 하지 않고, 프로그램이 끝나면
		//자동적으로 buffer의 내용이 비워지고 출력이 이뤄지지만,
		//write()를 하고, 프로그램이 끝나지 않고, 다른 작업을 하게 되면,
		//데이터는 buffer에 잔류하게 되므로, 출력이 이뤄지지 않는다.
		os.close();
	}
}