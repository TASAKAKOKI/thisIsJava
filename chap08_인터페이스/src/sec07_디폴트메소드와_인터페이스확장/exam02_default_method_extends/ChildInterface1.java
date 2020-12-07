package sec07_디폴트메소드와_인터페이스확장.exam02_default_method_extends;

public interface ChildInterface1 extends ParentInterface{
	//이 인터페이스는 ParentInterface의 default메소드를 그대로 상속받음.
	
	//ChildInterface1만의 추상메소드 선언
	void method3();
}
