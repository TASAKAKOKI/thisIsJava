package sec05_������Ʈ��.exam08_objectInputStream_objectOutputStream;

import java.io.Serializable;

//����ȭ�� ������ Ŭ������ �ǵ��� Serializable�������̽� ����
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
		//�� �ΰ��� �ʵ�� ����Ʈ�� ��ȯ�� ��
	transient int field4;
		//�� �ʵ�� ����ȭ���� ���ܵ�
}

class ClassB implements Serializable{
	int field1;
}