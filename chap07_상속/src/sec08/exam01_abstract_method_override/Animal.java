package sec08.exam01_abstract_method_override;

public abstract class Animal {
	//추상클래스 Animal에서 추상메소드 sound()를 선언
	//이때, abstract키워드를 붙여주고,
	//메소드 body{}는 작성하지않은채 내둔다.
	//실행블록{}은 상속받은 자식클래스에서 선언해 주어야 한다.
	public abstract void sound();
	
	public String kind;
	
	//추상클래스의 breathe()메소드는 모든 자식 객체에서 갖게 되는 메소드로
	//자식 객체들이 공통으로 갖고 있는 실행내용(행위)이라면 추상클래스에서 작성해준다.
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
}