package sec05_������Ʈ��.exam08_objectInputStream_objectOutputStream;

import java.io.Serializable;

//����ȭ�� ������ Ŭ������ �ǵ��� Serializable�������̽� ����
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	//�� �ΰ��� �ʵ�� ����Ʈ�� ��ȯ�� ��
	static int field3;
	transient int field4;
	//�� �ΰ��� �ʵ�� ����ȭ���� ���ܵ�
}

class ClassB implements Serializable{
	int field1;
}