package sec05_������Ʈ��.exam08_objectInputStream_objectOutputStream;

import java.io.Serializable;

public class ClassC implements Serializable {
	private static final long serialVersionUID = 1L;
		//�̷��� ��������� serivalVersionUID�� �������ָ�(���� �ߺ��� ���� ����),
		//ClassC�� �Ϻ� ������ �Ǵ���,
		//serialVersionUID�� ��� ������ �ǰ� ���� �������� �ʱ� ������,
		//readObject()���� ������ �߻����� �ʴ´�.
	
	int field1;
	int field2;
}