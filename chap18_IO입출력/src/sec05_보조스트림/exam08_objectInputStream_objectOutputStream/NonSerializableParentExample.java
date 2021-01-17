package sec05_보조스트림.exam08_objectInputStream_objectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam08_objectInputStream_objectOutputStream/Object.dat";
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "홍삼원";
		child.field2 = "홍길동";
		
		oos.writeObject(child);
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		
		ois.close(); fis.close();
	}
}