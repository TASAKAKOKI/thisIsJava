package sec07_디폴트메소드와_인터페이스확장.exam02_default_method_extends;

public class DefaultMethodExtendsExample {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("ci1-method1() 실행");
			}
			@Override
			public void method3() {
				System.out.println("ci1-method3() 실행");
			}
		};
		ci1.method1();
		ci1.method2();//default는 그대로 상속받았으므로, ParentInterface에 선언된 실행문이 그대로 실행
		ci1.method3();
		System.out.println(); //개행문
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("ci2-method1() 실행");
			}
			@Override
			public void method3() {
				System.out.println("ci2-method3() 실행");
			}
		};
		ci2.method1();
		ci2.method2();//CI2에서 PI의 default메소드를 재정의 하였으므로, 재정의된 메소드가 호출됨.
		ci2.method3();
		System.out.println(); //개행문

		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("ci3-method1() 실행");
			}
			//ChildInterface3은 ParentInterface의 default메소드를 추상메소드로 재정의 했으므로,
			//익명구현객체에는 추상메소드3에 대한 실체메소드가 필요하다.
			@Override
			public void method2() {
				System.out.println("ci3-method2() 실행");
			}
			@Override
			public void method3() {
				System.out.println("ci3-method3() 실행");
			}
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();
		System.out.println(); //개행문
	}
}
