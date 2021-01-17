package sec05_보조스트림.exam06_dataInputStream_dataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam06_dataInputStream_dataOutputStream";
		FileOutputStream fos = new FileOutputStream(filePath + "/primitive.dat");
									//.dat는 바이트 데이터가 저장된다.
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("이름입니다");
			//문자 출력을 원하는 경우 사용하는 메소드
		dos.writeDouble(95.5);
			//double값을 저장할 때 사용하는 메소드
		dos.writeInt(10);
			//int값을 저장할 때 사용하는 메소드

		dos.writeUTF("이름2입니다");
		dos.writeDouble(90.3);
		dos.writeInt(10);
		
		dos.flush();dos.close();fos.close();
		//생성된 파일을 메모장에서 읽으려고 하면, 문자데이터가 아니므로 깨지게 된다.
		
		
		FileInputStream fis = new FileInputStream(filePath + "/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		//저장된 순서대로 읽어야 한다.
		for(int i = 0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int age = dis.readInt();
			System.out.println("name : " + name + "; score: " + score + "; age: " + age);
		}

		dis.close();
		fis.close();
	}
}