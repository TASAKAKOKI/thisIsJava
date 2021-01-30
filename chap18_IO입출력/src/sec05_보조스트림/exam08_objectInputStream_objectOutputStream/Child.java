package sec05_������Ʈ��.exam08_objectInputStream_objectOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*Serializable�� ������ �ڽ�Ŭ����
 */
public class Child extends Parent implements Serializable {
	public String field2;

	/*
	 *writeObejct() readObject()�� ���������ش�.
	 *������ ����ϸ�, Serializable���� ��ü�� ���� �� ��.��� �� �ڵ�����Ǵ� �ݹ�޼ҵ��������,
	 *�̿� ���� ���� ���� �������ִ°�
	 *
	 *�ݵ��privateŰ����� �������־�� �Ѵ�.
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeUTF(field1); //writeUTF�� �� ����, Parent�� field1�� String�̹Ƿ�,
		oos.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		field1 = ois.readUTF();
		ois.defaultReadObject();
	}
}