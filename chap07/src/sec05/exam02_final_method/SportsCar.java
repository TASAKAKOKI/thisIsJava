package sec05.exam02_final_method;

public class SportsCar extends Car {
	//일반적으로 선언된 메소드는 재정의(Override) 할 수 있다.
	@Override
	public void speedUp() {speed += 10;}
	
	//부모 클래스에서 final로 선언된 메소드는 이곳 자식 클래스에서 재선언 될 수 없다.
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈추는 메소드를 재정의하고 싶으나, 재정의 할 수 없음");
		speed = 0;
	}
	
}
