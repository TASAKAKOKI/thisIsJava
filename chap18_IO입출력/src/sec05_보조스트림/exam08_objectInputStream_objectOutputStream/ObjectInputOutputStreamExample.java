package sec05_보조스트림.exam08_objectInputStream_objectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample{
	public static void main(String[] args) throws Exception{
			String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO입출력/src/sec05_보조스트림/exam08_objectInputStream_objectOutputStream/Object.dat";		
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new int[] {1,2,3});
			oos.writeObject(new String("홍길동"));
			oos.writeObject(100);
			oos.writeObject(95.5);
			oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		int[] obj1 = (int[]) ois.readObject();
		String obj2 = (String) ois.readObject();
		int obj3 = (int) ois.readObject();
		double obj4 = (double) ois.readObject();
		
		ois.close(); fis.close();

		System.out.println(obj1[0] + "," + obj1[1] + "," + obj1[2]);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}
}