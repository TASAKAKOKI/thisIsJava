package sec05.exam01_;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명객체 필드를 사용
		anony.parentField.wake();
		
		//익명객체 로컬변수를 사용
		anony.method1();
		
		//익명객체를 메소드의 매개값으로 사용
		anony.method2(new Person() {
			void study() {
				System.out.println("매개값으로 주어진 익명객체_익명객체의 메소드호출: 공부를 합니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("매개값으로 주어진 익명객체_Person()객체의 기본메소드 호출: 정시에 일어났습니다.");
				study();
			}
		});
	}
}