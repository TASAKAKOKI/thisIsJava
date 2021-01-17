package sec05_보조스트림.exam08_objectInputStream_objectOutputStream;

import java.io.Serializable;

public class ClassC implements Serializable {
	private static final long serialVersionUID = 1L;
		//이렇게 명시적으로 serivalVersionUID를 지정해주면(절대 중복이 되지 않음),
		//ClassC의 일부 수정이 되더라도,
		//serialVersionUID가 계속 재사용이 되고 새로 생성되지 않기 때문에,
		//readObject()사용시 오류가 발생하지 않는다.
	
	int field1;
	int field2;
}