package sec05_������Ʈ��.exam06_dataInputStream_dataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String filePath = "C:/Users/KOKHEEJIN/eclipse-workspace/chap18_IO�����/src/sec05_������Ʈ��/exam06_dataInputStream_dataOutputStream";
		FileOutputStream fos = new FileOutputStream(filePath + "/primitive.dat");
									//.dat�� ����Ʈ �����Ͱ� ����ȴ�.
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("�̸��Դϴ�");
			//���� ����� ���ϴ� ��� ����ϴ� �޼ҵ�
		dos.writeDouble(95.5);
			//double���� ������ �� ����ϴ� �޼ҵ�
		dos.writeInt(10);
			//int���� ������ �� ����ϴ� �޼ҵ�

		dos.writeUTF("�̸�2�Դϴ�");
		dos.writeDouble(90.3);
		dos.writeInt(10);
		
		dos.flush();dos.close();fos.close();
		//������ ������ �޸��忡�� �������� �ϸ�, ���ڵ����Ͱ� �ƴϹǷ� ������ �ȴ�.
		
		
		FileInputStream fis = new FileInputStream(filePath + "/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		//����� ������� �о�� �Ѵ�.
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