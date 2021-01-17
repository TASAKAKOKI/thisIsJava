package sec05_������Ʈ��.exam08_objectInputStream_objectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/* SerialVersionUID�� �޶�����, ����� ��ü�� �о���̴� readObject()�� ���� ������ UID�� ClassC��ü�� UID�� ���ϴµ� ���� �߻�
 * 
 */
public class SerialVersionUIDExample2 {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec05_������Ʈ��/exam08_objectInputStream_objectOutputStream/Object.dat";
		
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println(classC.field1);
		
		ois.close(); fis.close();
	}
}