package sec06_인터페이스_상속.exam01_interface_inheritance;

public class Example {
	public static void main(String args[]) {
		ImplementationC impl = new ImplementationC();
		
		System.out.println("===상속받은 상위 인터페이스A 타입으로 변환");
		System.out.println("===인터페이스A의 메소드만 호출 가능");
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();

		System.out.println("===상속받은 상위 인터페이스B 타입으로 변환");
		System.out.println("===인터페이스B의 메소드만 호출 가능");		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		System.out.println("===구현한 인터페이스C 타입으로 변환");
		System.out.println("===인터페이스C의 메소드 및 상속받은 상위 인터페이스의 메소드까지도 호출 가능");		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
