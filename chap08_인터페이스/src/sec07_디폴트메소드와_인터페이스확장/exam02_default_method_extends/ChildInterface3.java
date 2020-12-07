package sec07_디폴트메소드와_인터페이스확장.exam02_default_method_extends;

public interface ChildInterface3  extends ParentInterface{
	//이 인터페이스는 ParentInterface의 default메소드를 추상메소드로 변경하여 사용
	@Override
	void method2();
	
	//ChildInterface3만의 추상메소드 선언
	void method3();
}
