package sec05_보조스트림.exam08_objectInputStream_objectOutputStream;

import java.io.Serializable;

//직렬화가 가능한 클래스가 되도록 Serializable인터페이스 구현
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	//위 두개의 필드는 바이트로 변환이 됨
	static int field3;
	transient int field4;
	//위 두개의 필드는 직렬화에서 제외됨
}

class ClassB implements Serializable{
	int field1;
}