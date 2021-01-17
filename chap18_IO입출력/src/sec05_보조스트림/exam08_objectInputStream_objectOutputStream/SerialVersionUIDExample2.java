package sec05_보조스트림.exam08_objectInputStream_objectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/* SerialVersionUID가 달라지면, 저장된 객체를 읽어들이는 readObject()가 실제 파일의 UID와 ClassC객체의 UID를 비교하는데 오류 발생
 * 
 */
public class SerialVersionUIDExample2 {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam08_objectInputStream_objectOutputStream/Object.dat";
		
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println(classC.field1);
		
		ois.close(); fis.close();
	}
}