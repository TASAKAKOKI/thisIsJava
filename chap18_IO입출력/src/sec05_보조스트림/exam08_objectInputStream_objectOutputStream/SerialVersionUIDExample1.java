 package sec05_������Ʈ��.exam08_objectInputStream_objectOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
	public static void main(String[] args) throws Exception {
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec05_������Ʈ��/exam08_objectInputStream_objectOutputStream/Object.dat";
		
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		
		oos.writeObject(classC);
		oos.flush(); oos.close();fos.close();
	}
}