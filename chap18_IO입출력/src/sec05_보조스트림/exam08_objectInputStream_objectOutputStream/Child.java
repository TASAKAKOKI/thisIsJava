package sec05_보조스트림.exam08_objectInputStream_objectOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*Serializable을 구현한 자식클래스
 */
public class Child extends Parent implements Serializable {
	public String field2;

	/*
	 *writeObejct() readObject()을 재정의해준다.
	 *엄밀히 얘기하면, Serializable구현 객체를 생성 후 입.출력 시 자동실행되는 콜백메소드들이지만,
	 *이에 대해 좀데 상세히 서술해주는것
	 *
	 *반드시private키워드로 정의해주어야 한다.
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeUTF(field1); //writeUTF를 쓴 이유, Parent의 field1이 String이므로,
		oos.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		field1 = ois.readUTF();
		ois.defaultReadObject();
	}
}