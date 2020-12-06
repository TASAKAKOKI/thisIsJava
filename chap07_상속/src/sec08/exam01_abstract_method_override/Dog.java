package sec08.exam01_abstract_method_override;

public class Dog extends Animal{
	//부모 객체인 Animal이 기본 생성자를 갖고 있으므로,
	//super()를 생략해도 됨.
	public Dog() {
		this.kind = "포유류";
	}
	
	//상속받은 추상클래스 Animal에 추상메소드가 있으므로,
	//반드시 자식객체에서 재정의 해주어야 한다.
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!!");
	}
}