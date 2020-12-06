package sec02_인터페이스_선언.exam02_constant_field;

public interface RemoteControl {
	//인터페이스의 상수필드는 기본값이 없다. 
	//반드시 초기화를 해주어야 한다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	/*
	interface에서 정의된 static field는 static{}에서 초기화 할 수 없다.
	static {
		MIN_VOLUME = 0;
	}	
	*/
}
